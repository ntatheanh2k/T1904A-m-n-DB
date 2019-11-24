package Jv2_lap5;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ListStudent implements Initializable {
    public TableView<Student> tbView = new TableView<>();
    public TableColumn<Student,Integer> colID = new TableColumn<>();
    public TableColumn<Student,String> colName = new TableColumn<>();
    public TableColumn<Student,Integer> colAge = new TableColumn<>();
    public TableColumn<Student,Double> colMark = new TableColumn<>();
    public TextField searchName = new TextField();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colMark.setCellValueFactory(new PropertyValueFactory<>("mark"));

        String queryData = "SELECT * FROM listStudent";
        selectquery(queryData);
    }

    public void selectquery(String queryData){
        ObservableList<Student> list1 = FXCollections.observableArrayList();
        try{
            Connection conn = ConnectMySQL.ConnectMySQL();
            Statement stm = conn.createStatement();
            ResultSet resultData = stm.executeQuery(queryData);

            while (resultData.next()){
                list1.add(new Student(
                        resultData.getInt("id"),
                        resultData.getString("student_name"),
                        resultData.getInt("age"),
                        resultData.getDouble("mark"))
                );
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        tbView.setItems(list1);
    }

    public void searchname(){
        String txtSearch = searchName.getText();
        String queryData = "SELECT * FROM liststudent WHERE student_name LIKE '%"+txtSearch+"%'";
        selectquery(queryData);
    }

    public void deleteStudent(){
        int deleteID = tbView.getSelectionModel().getSelectedItems().get(0).getId();
        String deleteSelect = "DELETE FROM liststudent WHERE id="+deleteID;
        confirmdelete(deleteSelect);
    }

    public void confirmdelete(String deleteSelect){
        Pane confirm = new Pane();
        confirm.setPadding(new Insets(20,200,0,10));
        Text textconfirm = new Text(150,50,"Are you sure ?");
        Font fontcf = new Font("Arial",20);
        textconfirm.setFont(fontcf);
        Button button1 = new Button("Yes");
        button1.setLayoutX(75);
        button1.setLayoutY(100);
        button1.setPrefSize(100,25);
        Button button2 = new Button("No");
        button2.setLayoutX(225);
        button2.setLayoutY(100);
        button2.setPrefSize(100,25);
        confirm.getChildren().addAll(textconfirm,button1,button2);
        Scene scenecofirm = new Scene(confirm, 400,200);
        Stage stageconfirm = new Stage();
        stageconfirm.setTitle("Yes or No");
        stageconfirm.setScene(scenecofirm);
        stageconfirm.show();
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    Connection conn = ConnectMySQL.ConnectMySQL();
                    Statement stm = conn.createStatement();
                    stm.executeUpdate(deleteSelect);
                    conn.close();
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
                String queryData = "SELECT * FROM ListStudent";
                selectquery(queryData);
                stageconfirm.close();
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stageconfirm.close();
            }
        });
    }

    public void Add_Student(){
        try{
            Parent addStudent = FXMLLoader.load(getClass().getResource("Add.fxml"));
            Main.main.getScene().setRoot(addStudent);
            Main.mainStage.setTitle("Add_Student");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static class ConnectMySQL {
    }
}
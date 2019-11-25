package Jv2_Assigment2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class ListStudent implements Initializable {

    public static ObservableList<Student> list = FXCollections.observableArrayList();

    public TableView<Student> tbView = new TableView<>();
    public TableColumn<Student,String> tbname = new TableColumn<>();
    public TableColumn<Student,String> tbage = new TableColumn<>();
    public  TableColumn<Student,Integer> tbmark = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbname.setCellValueFactory(new PropertyValueFactory<>("name"));
        tbage.setCellValueFactory(new PropertyValueFactory<>("age"));
        tbmark.setCellValueFactory(new PropertyValueFactory<>("mark"));

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/TungT1904A";
            String username = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();

            String sql = "SELECT * FROM student";
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()){
                String y = rs.getString("student_name");
                int z = rs.getInt("age");
                int k = rs.getInt("mark");

                Student s2 = new Student(y,z,k);
                ListStudent.list.add(s2);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        tbView.setItems(list);
    }
    public void  addStudent(){
        try{
            Parent newStudent = FXMLLoader.load(getClass().getResource("addStudent.fxml"));
            Main.mainStage.getScene().setRoot(newStudent);
        }catch (Exception e) {
        }
    }
}
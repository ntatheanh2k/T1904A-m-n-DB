package Jv2_lap6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ListPerson implements Initializable {
    public ListView<Person> tbview = new ListView<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String queryData = "SELECT * FROM person";
        selectlist(queryData);
    }

    public void selectlist(String queryData){
        ObservableList<Person> listperson1 = FXCollections.observableArrayList();
        try{
            Connection conn = ConnectDB.ConnectMySQL();
            Statement stm = conn.createStatement();
            ResultSet resultSet = stm.executeQuery(queryData);

            while (resultSet.next()){
                listperson1.add(new Person(
                        resultSet.getInt("personID"),
                        resultSet.getString("person_name"),
                        resultSet.getString("company"),
                        resultSet.getString("address")
                ));
            }
            conn.close();
        }
        catch (Exception e){
            e.getMessage();
        }
        tbview.setItems(listperson1);
    }

    public static String namechoose = "";
    public void choosePerson(){
        namechoose = tbview.getSelectionModel().getSelectedItems().get(0).getPerson_name();
        try{
            Parent listphone = FXMLLoader.load(getClass().getResource("listphone.fxml"));
            Main.mainStage.getScene().setRoot(listphone);
            Main.mainStage.setTitle("List phone for User");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

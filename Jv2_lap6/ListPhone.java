package Jv2_lap6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ListPhone implements Initializable {
    public ListView<PhoneNumber> tbview = new ListView<>();
    public Text txtTitleListPhone = new Text();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String queryData = "SELECT * FROM phonenumber WHERE personID = (SELECT personID FROM person WHERE person_name LIKE '"+ListPerson.namechoose+"')";
        selectlist(queryData);
        txtTitleListPhone.setText(ListPerson.namechoose+" - List phonenumbers:");

    }
    public void selectlist(String queryData){
        ObservableList<PhoneNumber> listphone1 = FXCollections.observableArrayList();
        try{
            Connection conn = ConnectDB.ConnectMySQL();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(queryData);

            while (rs.next()){
                listphone1.add(new PhoneNumber(
                        rs.getString("number"),
                        rs.getString("phonetype"),
                        rs.getInt("personID")
                ));
            }
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        tbview.setItems(listphone1);
    }

    public void backToListPerson(){
        try{
            Parent listperson = FXMLLoader.load(getClass().getResource("listperson.fxml"));
            Main.mainStage.getScene().setRoot(listperson);
            Main.mainStage.setTitle("List Person");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
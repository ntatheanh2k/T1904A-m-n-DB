package Jv2_lap5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.*;

public class Add_Student {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void saveStudent(){
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        double mark = Double.parseDouble(txtMark.getText());

        try{
            Connection conn = ConnectMySQL.ConnectMySQL();
//            Statement stm = conn.createStatement();
//            String updateData = "INSERT INTO liststudent(student_name,age,mark) VALUES('"+name+"',"+age+","+mark+")";
//            stm.executeUpdate(updateData);
            String updateData = "INSERT INTO liststudent(student_name,age,mark) VALUES(?,?,?)";
            PreparedStatement prstm = conn.prepareStatement(updateData);
            prstm.setString(1,name);
            prstm.setInt(2,age);
            prstm.setDouble(3,mark);
            prstm.execute();

            conn.close();
            System.out.println("Ban vua them 1 sinh vien: "+name+" - Tuoi: "+age+" - Diem: "+mark);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        showlist();
    }

    public void showlist(){
        try {
            Parent listStudent = FXMLLoader.load(getClass().getResource("liststudent.fxml"));
            Main.mainStage.getScene().setRoot(listStudent);
            Main.mainStage.setTitle("List Students");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
package Jv2_lap5;
import java.sql.*;
public class Table {
    public static void table(String args []){
        try {
         Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/theanh1";
            String username ="root";
            String password ="";
            Connection conn = DriverManager.getConnection(url,username,password);

            Statement stm = conn.createStatement();

            String ins_sql ="INSERT INTO theanh1(name,age,mark)VALUES('')";



        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

package Jv2_lap6;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection ConnectMySQL() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/labsession6?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url,username,password);
    }
}
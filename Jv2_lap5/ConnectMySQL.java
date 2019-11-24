package Jv2_lap5;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySQL {
    public static Connection ConnectMySQL() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/labsession5?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url,username,password);
    }
}

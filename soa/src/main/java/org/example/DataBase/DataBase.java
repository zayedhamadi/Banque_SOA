package org.example.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

    private static final String url = "jdbc:mysql://localhost:3306/soa";
    private static final String user = "root";
    private static final String pw = "root";
    private Connection conn;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pw);
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            System.out.println("Failed to Connect !" + e.getMessage());
        }
        return conn;
    }
}

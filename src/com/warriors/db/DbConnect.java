package com.warriors.db;

import java.sql.*;

public class DbConnect {

    private Connection connection;
    private static DbConnect instance;

    private DbConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver OK");

            String url = "jdbc:mysql://localhost:3306/dd?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
            String user = "root";
            String pwd = "";

            this.connection = DriverManager.getConnection(url, user, pwd);
            if (connection != null) {
                System.out.println("Connection DB OK");
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static DbConnect getInstance() {
        if (instance == null) {
            instance = new DbConnect();
        }
        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }

}

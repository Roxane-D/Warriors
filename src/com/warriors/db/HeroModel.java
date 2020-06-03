package com.warriors.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HeroModel {

    private Connection connection;

    public void getHeroes() {
        try {
            PreparedStatement statement = this.connection.prepareStatement("SELECT * from `hero`");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String table = resultSet.getString("name");
                System.out.println(table);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

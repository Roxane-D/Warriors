package com.warriors.db;

import com.warriors.characters.Hero;

import java.sql.*;

public class DbConnect {

    private Connection connection;

    public DbConnect() {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver OK");

            String url = "jdbc:mysql://localhost:3306/dd?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
            String user = "root";
            String pwd = "";

            this.connection = DriverManager.getConnection(url, user, pwd);
            if (connection != null) {
                System.out.println("Connection DB OK");
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void createHero(Hero hero) {
        try {
            String sql = "INSERT INTO hero (Type, Name, Health, Strength) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setString(1, hero.getType());
            statement.setString(2, hero.getName());
            statement.setInt(3, hero.getHealth());
            statement.setInt(4, hero.getStrength());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updateHero(String name, int id) {
        try {
            String sql = "UPDATE hero SET Name = ? WHERE id = ?";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, id);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteHero(int id) {
        try {
            String sql = "DELETE FROM hero WHERE id = ?";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }


}

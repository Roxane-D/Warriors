package com.warriors.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HeroModel {

    private final Connection connection = DbConnect.getInstance().getConnection();

    public void createHero(String type, String name, int health, int strength) {
        try {
            String sql = "INSERT INTO hero (Type, Name, Health, Strength) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setString(1, type);
            statement.setString(2, name);
            statement.setInt(3, health);
            statement.setInt(4, strength);
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

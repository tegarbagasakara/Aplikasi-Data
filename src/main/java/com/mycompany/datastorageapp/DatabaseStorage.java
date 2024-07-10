/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastorageapp;

/**
 *
 * @author Kidoo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Implementasi pada SQLite database
public class DatabaseStorage implements DataStorage {
    private Connection connection;

    public DatabaseStorage(String databasePath) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + databasePath);
        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    @Override
    public void writeData(String data) {
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO data (value) VALUES (?)")) {
            statement.setString(1, data);
            statement.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT value FROM data")) {
            while (resultSet.next()) {
                sb.append(resultSet.getString("value")).append("\n");
            }
        } catch (SQLException e) {
        }
        return sb.toString();
    }
}

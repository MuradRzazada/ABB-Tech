package org.finalproject.repository;

import org.finalproject.entity.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepository {
    private static final String URL = "jdbc:postresql://localhost:5432/abb_tech";
    private static final String USERNAME = "psg_user";
    private static final String PASSWORD = "pass";

    public static void main(String[] args) {

    }
    public boolean saveUser(User user) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String s = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkUser(String username, String password) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String s = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(s);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

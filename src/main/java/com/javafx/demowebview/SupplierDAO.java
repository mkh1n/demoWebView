package com.javafx.demowebview;


import java.sql.*;

public class SuppliersDAO {
    private static Connection conn;

    public void connect() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "postgres";
        conn = DriverManager.getConnection(url, user, password);
    }

    public void close() throws SQLException {
        conn.close();
    }

    public int addNewSupplier(String type, String director, String phone, String rating, String name) throws SQLException{
        String sqlQuery = "INSERT INTO suppliers (type, director, phone, rating, name) VALUES (?, ?, ?, ?, ?) RETURNING id";
        try (PreparedStatement statement = conn.prepareStatement(sqlQuery)) {
            statement.setString(1, type);
            statement.setString(2, director);
            statement.setString(3, phone);
            statement.setString(4, rating);
            statement.setString(5, name);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getInt("id");
                } else {
                    throw new SQLException("Failed to add supplier.");
                }
            }
        }
    }

    public List<Supplier> getAllReaders() throws SQLException {
        List<Reader> result = new ArrayList<>();
        String sqlQuery = "SELECT * FROM readers";
        try (var statement = conn.createStatement();
             var resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                var reader = new Reader(name, email);
                result.add(reader);
            }
        }
        return result;
    }
}

package com.templates.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
    private static final String username = "root";
    private static final String password = "localhost";
    private static DbSingleton instance = null;
    private Connection connection;

    private DbSingleton() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public static DbSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new DbSingleton();
        } else if (instance.getConnection().isClosed()) {
            instance = new DbSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}

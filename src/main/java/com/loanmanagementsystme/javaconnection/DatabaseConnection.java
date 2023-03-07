package com.loanmanagementsystme.javaconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connections() {
        final String username = "root";
        //please do not upload password and username here
        final String password = "in9sa4UxQ2k##Z#$eT";
        final String URL = "jdbc:mysql://localhost:3306/LoanManagementSystem";
        try {
            Connection con = DriverManager.getConnection(URL, username, password);
            return con;
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return null;
    }
}

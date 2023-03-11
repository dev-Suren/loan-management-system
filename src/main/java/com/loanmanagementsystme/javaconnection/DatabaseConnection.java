package com.loanmanagementsystme.javaconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connections() throws SQLException{
        final String username = "root";
        //please do not upload password and username here
        final String password = "in9sa4UxQ2k##Z#$eT";
        final String URL = "jdbc:mysql://localhost:3306/LoanManagementSystem";
        return DriverManager.getConnection(URL, username, password);
    }
}

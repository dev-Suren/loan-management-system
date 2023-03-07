package com.loanmanagementsystme;


import com.loanmanagementsystme.inputinformation.InputDetailsCheckers;
import com.loanmanagementsystme.javaconnection.DatabaseConnection;
import com.loanmanagementsystme.userdetails.LoanDetails;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        InputDetailsCheckers inputDetailsCheckers = new InputDetailsCheckers();
        LoanDetails loanDetails = inputDetailsCheckers.checkDetails();
        System.out.println(loanDetails.toString());

    }
}
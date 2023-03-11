package com.loanmanagementsystme;
import com.loanmanagementsystme.loanfunctions.LoanFunctions;


import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        LoanFunctions loanFunctions = new LoanFunctions();
        loanFunctions.commercialLoan(800000,5);

    }

}
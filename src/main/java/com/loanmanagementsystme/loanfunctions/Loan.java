package com.loanmanagementsystme.loanfunctions;

public interface Loan {
    double personalLoan(double totalLoan, double tenure);
    double commercialLoan(double totalLoan, double tenure);
    double studentLaon(double totalLoan, double tenure);
    double mortgageLoan(double totalLoan, double tenure);
}

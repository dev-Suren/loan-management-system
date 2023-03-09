package com.loanmanagementsystme.loanfunctions;

public interface Loan {
    void personalLoan(double totalLoan);
    void commercialLoan(double totalLoan, int tenure);
    void studentLaon(double totalLoan, int tenure);
    void mortgageLoan(double totalLoan, int tenure);
}

package com.loanmanagementsystme.loanfunctions;

public interface Loan {
    void personalLoan(double totalLoan);
    void  personalLoan(double totalLoan,double tenure);
    void commercialLoan(double totalLoan, double tenure);
    void studentLaon(double totalLoan, double tenure);
    void mortgageLoan(double totalLoan, double tenure);
}

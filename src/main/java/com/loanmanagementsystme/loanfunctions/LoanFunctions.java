package com.loanmanagementsystme.loanfunctions;

public class LoanFunctions implements Loan {


    @Override
    public double personalLoan(double totalLoan) {
        final int ARP = 8;
        return 0;
    }

    public double personalLoan(double totalLoan,double tenure){
        return 0;
    }

    @Override
    public double commercialLoan(double totalLoan, double tenure) {
        final int ARP = 12;
        return 0;
    }

    @Override
    public double studentLaon(double totalLoan, double tenure) {
        final int ARP = 6;
        return 0;
    }

    @Override
    public double mortgageLoan(double totalLoan, double tenure) {
        final int ARP = 5;
        return 0;
    }

    private double EMI(double totlaLaon, double ARP,double tenure){
        return totlaLaon *(ARP/100)*(tenure*12);
    }
}

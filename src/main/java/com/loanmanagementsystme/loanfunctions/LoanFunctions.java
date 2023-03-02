package com.loanmanagementsystme.loanfunctions;

public class LoanFunctions implements Loan {


    @Override
    public double personalLoan(double totalLoan, double tenure) {
        return 0;
    }

    @Override
    public double commercialLoan(double totalLoan, double tenure) {
        return 0;
    }

    @Override
    public double studentLaon(double totalLoan, double tenure) {
        return 0;
    }

    @Override
    public double mortgageLoan(double totalLoan, double tenure) {
        return 0;
    }

    private double interestCalculator(double totlaLaon, double percentage,double tenure){
        return totlaLaon *(percentage/100)*tenure;
    }
}

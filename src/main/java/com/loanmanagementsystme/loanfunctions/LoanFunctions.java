package com.loanmanagementsystme.loanfunctions;
import com.loanmanagementsystme.inputinformation.InputDetailsCheckers;
import com.loanmanagementsystme.userdetails.LoanDetails;

import java.io.IOException;

public class LoanFunctions implements Loan {


    @Override
    public void personalLoan(double totalLoan){
        final int ARP = 8;
        LoanDetails loan;
        final String loanType = "Personal Loan";
        try{
            loan = getLoanDetailsObject();
            double EMI = EMI(totalLoan,ARP,1);
            loan.setLonaType(loanType);
            loan.setPercentage(ARP);
            loan.setEMI(EMI);
            loan.setTotalAmount(totalLoan);
            LoanInvoice.invoie(loan);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public void personalLoan(double totalLoan,double tenure){
    }

    @Override
    public void commercialLoan(double totalLoan, double tenure) {
        final int ARP = 12;

    }

    @Override
    public void studentLaon(double totalLoan, double tenure) {
        final int ARP = 6;

    }

    @Override
    public void mortgageLoan(double totalLoan, double tenure) {
        final int ARP = 5;

    }

    private double EMI(double totlaLaon, double ARP,double tenure){
        ARP = ARP/(12*100);
         tenure = tenure * 12;
        return (totlaLaon *ARP*Math.pow(1+ARP,tenure))/(Math.pow(1+ARP,tenure-1));
    }

    private LoanDetails getLoanDetailsObject()throws IOException{
        InputDetailsCheckers inputDetailsCheckers = new InputDetailsCheckers();
        LoanDetails loan = inputDetailsCheckers.checkDetails();
        return loan;
    }
}

package com.loanmanagementsystme.loanfunctions;
import com.loanmanagementsystme.inputinformation.InputDetailsCheckers;
import com.loanmanagementsystme.javaconnection.LoanDao;
import com.loanmanagementsystme.userdetails.LoanDetails;

import java.io.IOException;

public class LoanFunctions implements Loan {
    private LoanDao inputs= new LoanDao();


    @Override
    public void personalLoan(double totalLoan){
        final int ARP = 8;
        final String loanType = "Personal Loan";
        try{
            double EMI = EMI(totalLoan,ARP,1);
            getLoanDetailsObject().setLonaType(loanType);
            getLoanDetailsObject().setPercentage(ARP);
            getLoanDetailsObject().setEMI(EMI);
            getLoanDetailsObject().setTotalAmount(totalLoan);
            inputs.inputValues(getLoanDetailsObject(),1);
            LoanInvoice.invoie(getLoanDetailsObject());


        }catch (IOException e){
            e.printStackTrace();
        }


    }


    @Override
    public void commercialLoan(double totalLoan, int tenure) {
        final int ARP = 12;
        final String loanType = "Commercial Loan";
        try{
            double EMI = EMI(totalLoan,ARP,tenure);
            getLoanDetailsObject().setLonaType(loanType);
            getLoanDetailsObject().setPercentage(ARP);
            getLoanDetailsObject().setEMI(EMI);
            getLoanDetailsObject().setTotalAmount(totalLoan);
            inputs.inputValues(getLoanDetailsObject(),tenure);
            LoanInvoice.invoie(getLoanDetailsObject());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void studentLaon(double totalLoan, int tenure) {
        final int ARP = 6;
        final String loanType = "Student Loan";
        try{
            double EMI = EMI(totalLoan,ARP,tenure);
            getLoanDetailsObject().setLonaType(loanType);
            getLoanDetailsObject().setPercentage(ARP);
            getLoanDetailsObject().setEMI(EMI);
            getLoanDetailsObject().setTotalAmount(totalLoan);
            inputs.inputValues(getLoanDetailsObject(),tenure);
            LoanInvoice.invoie(getLoanDetailsObject());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void mortgageLoan(double totalLoan, int tenure) {
        final int ARP = 5;
        final String loanType = "Mortgage Loan";
        try{
            double EMI = EMI(totalLoan,ARP,tenure);
            getLoanDetailsObject().setLonaType(loanType);
            getLoanDetailsObject().setPercentage(ARP);
            getLoanDetailsObject().setEMI(EMI);
            getLoanDetailsObject().setTotalAmount(totalLoan);
            inputs.inputValues(getLoanDetailsObject(),tenure);
            LoanInvoice.invoie(getLoanDetailsObject());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private double EMI(double totlaLaon, double ARP,double tenure){
        ARP = ARP/(12*100);
         tenure = tenure * 12;
        return (totlaLaon *ARP*Math.pow(1+ARP,tenure))/(Math.pow(1+ARP,tenure-1));
    }

    private LoanDetails getLoanDetailsObject()throws IOException{
        InputDetailsCheckers inputDetailsCheckers = new InputDetailsCheckers();
        return inputDetailsCheckers.checkDetails();
    }
}

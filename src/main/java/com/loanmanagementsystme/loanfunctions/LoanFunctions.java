package com.loanmanagementsystme.loanfunctions;
import com.loanmanagementsystme.inputinformation.InputDetailsCheckers;
import com.loanmanagementsystme.javaconnection.LoanDao;
import com.loanmanagementsystme.userdetails.LoanDetails;

import java.io.IOException;

public class LoanFunctions implements Loan {
    @Override
    public void personalLoan(double totalLoan){
        final int ARP = 8;
        final String loanType = "Personal Loan";
        double EMI = EMI(totalLoan,ARP,1);
        performFunction(loanType,ARP,EMI,totalLoan,1);
    }


    @Override
    public void commercialLoan(double totalLoan, int tenure) {
        final int ARP = 12;
        final String loanType = "Commercial Loan";
        double EMI = EMI(totalLoan,ARP,tenure);
        performFunction(loanType,ARP,EMI,totalLoan,tenure);
    }

    @Override
    public void studentLaon(double totalLoan, int tenure) {
        final int ARP = 6;
        final String loanType = "Student Loan";
        double EMI = EMI(totalLoan,ARP,tenure);
        performFunction(loanType,ARP,EMI,totalLoan,tenure);

    }

    @Override
    public void mortgageLoan(double totalLoan, int tenure) {
        final int ARP = 5;
        final String loanType = "Mortgage Loan";
        double EMI = EMI(totalLoan,ARP,tenure);
        performFunction(loanType,ARP,EMI,totalLoan,tenure);


    }

    private double EMI(double totlaLaon, double ARP,double tenure){
        ARP = ARP/(12*100);
        tenure = tenure * 12;
        return (totlaLaon *ARP*Math.pow(1+ARP,tenure))/(Math.pow(1+ARP,tenure-1));
    }

//    private LoanDetails getLoanDetailsObject()throws IOException{
//        InputDetailsCheckers inputDetailsCheckers = new InputDetailsCheckers();
//        return inputDetailsCheckers.checkDetails();
//    }

    private void performFunction(String loanType,int ARP,double EMI,double totalLoan,int tenure){

        LoanDao inputs= new LoanDao();
        try{
            InputDetailsCheckers inputDetailsCheckers = new InputDetailsCheckers();
            LoanDetails details = inputDetailsCheckers.checkDetails();
            details.setLonaType(loanType);
            details.setPercentage(ARP);
            details.setEMI(EMI);
            details.setTotalAmount(totalLoan);
            inputs.inputValues(details,tenure);
            LoanInvoice.invoie(details);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}

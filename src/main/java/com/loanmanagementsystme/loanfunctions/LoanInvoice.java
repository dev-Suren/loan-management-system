package com.loanmanagementsystme.loanfunctions;
import com.loanmanagementsystme.userdetails.LoanDetails;

public class LoanInvoice {

    public static void invoie(LoanDetails loan){
        String invoice = "";
        invoice += "Loan Invoice #" + loan.getID() + "\n";
        invoice += "Loan amount: Rs" + loan.getTotalAmount() + "\n";
        invoice += "Interest Rate: " + loan.getPercentage() + "\n";
        invoice += "Loan Type: " + loan.getLonaType() + "\n";
        invoice += "Thank you for choosing to work with us. If you have any questions or concerns, please don't hesitate to contact us.";
        System.out.println(invoice);
    }
}

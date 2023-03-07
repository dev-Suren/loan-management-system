package com.loanmanagementsystme.userdetails;

public class LoanDetails extends UserDetails{
    private String lonaType;
    private double totalAmount;
    private double percentage;
    private double EMI;

    public double getEMI() {
        return EMI;
    }

    public void setEMI(double EMI) {
        this.EMI = EMI;
    }

    public String getLonaType() {
        return lonaType;
    }

    public void setLonaType(String lonaType) {
        this.lonaType = lonaType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

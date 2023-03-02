package com.loanmanagementsystme.userdetails;

public class UserDetails {
    private int ID;
    private String fullName;
    private String phoneNumber;
    private double incomePerYear;
    private String fullAddress;
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getIncomePerYear() {
        return incomePerYear;
    }

    public void setIncomePerYear(double incomePerYear) {
        this.incomePerYear = incomePerYear;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}

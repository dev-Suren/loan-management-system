package com.loanmanagementsystme.userdetails;

public class UserDetails {
    private int ID;
    private String fullName;
    private String phoneNumber;
    private double incomePerYear;
    private String fullAddress;
    private String email;

    public UserDetails(int ID, String fullName, String phoneNumber, double incomePerYear, String fullAddress, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.incomePerYear = incomePerYear;
        this.fullAddress = fullAddress;
        this.email = email;
    }
//Constructor Overloading
    public UserDetails() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

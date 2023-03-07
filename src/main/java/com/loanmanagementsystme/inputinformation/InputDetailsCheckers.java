package com.loanmanagementsystme.inputinformation;
import com.loanmanagementsystme.javaconnection.LoanDao;
import com.loanmanagementsystme.userdetails.LoanDetails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.regex.Pattern;

public class InputDetailsCheckers{
    /*This checkDetails method check every details like phone number
     Name and so and store it in object*/
    public LoanDetails checkDetails()throws IOException {
        String message="Please State your Full name Here";
        String phoneMessage = "Please input phone numbers with country code(+91)";
        //Creating objects of LoanDetails
        LoanDetails details = new LoanDetails();
        //taking input using bufferReader.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Validator validateName = (String inputs) -> Pattern.matches("([A-Z][a-z]{3,} )([A-Z][a-z]{3,} )?([A-Z][a-z]{3,})",inputs);
        while(true){
            System.out.println(message);
            String name = bufferedReader.readLine();
            if(validateName.validator(name)) {
                details.setFullName(name);
                break;
            }
            message = "Please state your name correctly";

        }
        Validator validatePhone = (String input) -> Pattern.matches("((\\+*)((0[ -]*)*|(('+'91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}",input);
        while(true){
            System.out.println(phoneMessage);
            String phone = bufferedReader.readLine();
            if(validatePhone.validator(phone)){
                details.setPhoneNumber(phone);
                break;
            }
            phoneMessage = "Please input your number correctly";
        }
        while(true){
            System.out.println("Please mention your income per year here");
            int income = Integer.parseInt(bufferedReader.readLine());
            if(income>10_00_00){
                details.setIncomePerYear(income);
                break;
            }
        }
        Validator addressValidator = (String inputs)->Pattern.matches("^[#.0-9a-zA-Z\\s,-]+$",inputs);
        while(true){
            System.out.println("Please input your address here(Format: #1, Delhi Highway, Phagwara - 114411 )");
            String address = bufferedReader.readLine();
            if(addressValidator.validator(address)){
                details.setFullAddress(address);
                break;
            }
        }
        Validator emailValidator = (String input) -> Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$",input);
        while(true){
            System.out.println("please input your email address here");
            String email = bufferedReader.readLine();
            if(emailValidator.validator(email)){
                details.setEmail(email);
                break;
            }
        }
        while(true){
            int key = createLoanId();
            LoanDao loanDao = new LoanDao();
            if(loanDao.checkPrimaryKey(key)){
                details.setID(key);
                break;
            }
        }
        return details ;
    }

    private int createLoanId(){
        Random random = new Random();
        return random.nextInt(10000,100000);
    }
}

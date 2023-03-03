package com.loanmanagementsystme.inputinformation;
import com.loanmanagementsystme.userdetails.LoanDetails;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class InputDetailsCheckers{
    private boolean validNumber=true;
    private boolean validName = true;
    /*This checkDetails methos check every details like phone number
     Name and so and store it in object*/
    public LoanDetails checkDetails()throws IOException {
        String message="Please State your Full name Here";
        String phoneMessage = "Please input phone numbers with country code(+91)";
        //Creating objects of LoanDetails
        LoanDetails details = new LoanDetails();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(validName){
            System.out.println(message);
            String pattern ="([A-Z][a-z]{3,} )([A-Z][a-z]{3,} )?([A-Z][a-z]{3,})";
            String name = bufferedReader.readLine();
            if(Pattern.matches(pattern,name)) {
                details.setFullName(name);
                validName = false;
            }
            message = "Please state your name correctly";
        }
        while(validNumber){
            System.out.println(phoneMessage);
            String pattern = "((\\+*)((0[ -]*)*|(('+'91 )*))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}";
            String phone = bufferedReader.readLine();
            if(Pattern.matches(pattern,phone)){
                details.setPhoneNumber(phone);
                validNumber = false;
            }
            phoneMessage = "Please input your number correctly";
        }

//        while(){
//        }





        return details ;

    }
}

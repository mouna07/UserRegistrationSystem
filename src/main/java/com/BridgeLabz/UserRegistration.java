package com.BridgeLabz;



import java.util.Scanner;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


    public static void main(String args[]) throws UserRegistrationException {
        UserRegistration User = new UserRegistration();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first name");
        User.UC1(sc.nextLine());
        System.out.println("enter the last name");
        User.UC2(sc.nextLine());
        System.out.println("enter the email name");
        User.UC3(sc.nextLine());
        System.out.println("enter the phone name");
        User.UC4(sc.nextLine());
        System.out.println("enter the password name");
        User.UC5toUC8(sc.nextLine());
    }

    public  String UC1(String firstNameUserInput) throws UserRegistrationException {


    public static String UC1(String firstNameUserInput) {

        Pattern firstName = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
        Matcher match = firstName.matcher(firstNameUserInput);
        boolean patternValidity = match.matches();
        try {
            if (patternValidity == true)
                return "HAPPY";
            else
                return "SAD";
        }
        catch(NullPointerException e) {
            throw new UserRegistrationException("Please enter valid first name");
        }
    }

    public  String UC2(String lastNameUserInput) throws UserRegistrationException {
        Pattern lastName = Pattern.compile("[A-Z]{1}[a-z]{2,}$");
        Matcher match = lastName.matcher(lastNameUserInput);
        boolean patternValidity = match.matches();
        try {
            if (patternValidity == true)
                return "HAPPY";
            else
                return "SAD";
        }

        catch(NullPointerException e) {
            throw new UserRegistrationException("Please enter valid last name");
        }
    }
        else {
            return "SAD";


    public  String UC3(String emailUserInput) throws UserRegistrationException {
        Pattern email = Pattern.compile("^[a-zA-Z]{3}\\.[a-zA-Z]{1,}@[a-zA-Z]{2}\\.[a-zA-Z]{2}\\.[a-zA-Z]{1,}$");
        Matcher match = email.matcher(emailUserInput);
        boolean patternValidity = match.matches();
        try {
            if (patternValidity == true)
                return "HAPPY";
            else
                return "SAD";
        }
        catch(NullPointerException e) {
            throw new UserRegistrationException("Please enter valid Email");
        }
    }

    public String UC4(String mobileUserInput) throws UserRegistrationException {
        Pattern mobileNumber = Pattern.compile("^[1-9]{2}\\s{1}[0-9]{1}[0-9]{9}$");
        Matcher match = mobileNumber.matcher(mobileUserInput);
        boolean patternValidity = match.matches();
        try {
            if (patternValidity == true)
                return "HAPPY";
            else
                return "SAD";
        }

        catch(NullPointerException e) {
            throw new UserRegistrationException("Please enter valid mobile number");
        }
    }

        else {
            return "SAD";


    public  String UC5toUC8(String passwordUserInput) throws UserRegistrationException {
        Pattern password = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}");
        Matcher match = password.matcher(passwordUserInput);
        boolean patternValidity = match.matches();
        try {
            if (patternValidity == true)
                return "HAPPY";
            else
                return "SAD";
        }

        catch(NullPointerException e) {
            throw new UserRegistrationException("Please enter valid password");
        }
    }

        else {
            return "SAD";




    public  boolean UC9(String sampleEmailValidation) {
        Pattern emailValidation = Pattern.compile("^([a-zA-a0-9\\.\\-\\+]+)@([a-zA-Z0-9\\.]{1,5})([a-zA-Z\\.]+){1,3}([a-zA-Z]{1,3})$");
        Matcher match = emailValidation.matcher(sampleEmailValidation);
        boolean patternValidity = match.matches();
        return patternValidity;
    }


}
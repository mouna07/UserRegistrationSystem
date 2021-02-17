package com.BridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String args[]) {
            UserRegistration User = new UserRegistration();
            Scanner scanner = new Scanner(System.in);
            System.out.println("**********welcome to the user registration problem**********");
            System.out.println("enter the first name:");
            User.ValidateName(scanner.next());
            System.out.println("enter the Last name:");
            User.ValidateName(scanner.next());
            System.out.println("Enter the valid email id:");
            User.ValidateEmail(scanner.next());
            System.out.println("Enter the valid phone number:");
            User.ValidatePhoneNo(scanner.next());
    }
    public void ValidateName( String name){

        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", name)) {
            System.out.println("Valid  Name");
        } else {
            System.out.println("Invalid  Name");
        }
    }
    public String ValidateEmail(String email){

        if (Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\\\.\" + \"[a-zA-Z0-9_+&*-]+)*@\" + \"(?:[a-zA-Z0-9-]+\\\\.)+[a-z\" + \"A-Z]{2,7}$", email)) {
            System.out.println("Valid EmailId");
        } else {
            System.out.println("Invalid  EmailId");
        }
        return email;
    }
    public void ValidatePhoneNo(String Number){

        if (Pattern.matches("(([0-9]{2})?)[ ][0-9]{10}", Number)) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
    public void ValidatePassword(String password){

        if (Pattern.matches("((^(?=.*[A-Z]))(?=.*[0-9])(?=.*[a-z])(?=.*[@*&^%#-*+!]{1}).{8,}$)", password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

}
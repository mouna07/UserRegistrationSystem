package com.BridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String args[]) {
            UserRegistration User = new UserRegistration();

            System.out.println("**********welcome to the user registration problem**********");
            System.out.println("enter the first name:");
            User.ValidateName();
            System.out.println("enter the Last name:");
            User.ValidateName();
            System.out.println("Enter the valid email id:");
            User.ValidateEmail();
            System.out.println("Enter the valid phone number:");
            User.ValidatePhoneNo();
    }
    public void ValidateName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if (Pattern.matches("[A-Z][a-z]{2}[a-z]*", name)) {
            System.out.println("Valid  Name");
        } else {
            System.out.println("Invalid  Name");
        }
    }
    public void ValidateEmail(){
        Scanner sc = new Scanner(System.in);
        String Email = sc.next();
        if (Pattern.matches("[a-zA-Z]+([._+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}+(?:\\\\.[a-z]{2,}){0,1}$)", Email)) {
            System.out.println("Valid EmailId");
        } else {
            System.out.println("Invalid  EmailId");
        }
    }
    public void ValidatePhoneNo(){
        Scanner sc = new Scanner(System.in);
        String Number = sc.next();
        if (Pattern.matches("(([0-9]{2})?)[ ][0-9]{10}", Number)) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }

}
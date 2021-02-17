package com.BridgeLabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String args[]) {
            UserRegistration User = new UserRegistration();

            System.out.println("**********welcome to the user registration problem**********");
            System.out.println("enter the first name");
            User.ValidateName();
            System.out.println("enter the Last name");
            User.ValidateName();
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
}
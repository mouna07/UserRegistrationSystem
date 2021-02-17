package com.BridgeLabz;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void validateEmail(){
        String testValidString1 = userRegistration.ValidateEmail("abc@yahoo.com");
        String testValidString2 = userRegistration.ValidateEmail("abc-100@yahoo.com");
        String testValidString3 = userRegistration.ValidateEmail("abc.100@yahoo.com");
        String testValidString4 = userRegistration.ValidateEmail("abc111@abc.com");
        String testValidString5 = userRegistration.ValidateEmail("abc-100@abc.net");
        String testValidString6 = userRegistration.ValidateEmail("abc.100@abc.com.au");
        String testValidString7 = userRegistration.ValidateEmail("abc@1.com");
        String testValidString8 = userRegistration.ValidateEmail("abc@gmail.com.com");
        String testValidString9 = userRegistration.ValidateEmail("abc+100@gmail.com");

        String testInvalidString1 = userRegistration.ValidateEmail("abc");
        String testInvalidString2 = userRegistration.ValidateEmail("abc@.com.my");
        String testInvalidString3 = userRegistration.ValidateEmail("abc123@gmail.a");
        String testInvalidString4 = userRegistration.ValidateEmail("abc123@.com");
        String testInvalidString5 = userRegistration.ValidateEmail("abc123@.com.com");
        String testInvalidString6 = userRegistration.ValidateEmail(".abc@abc.com");
        String testInvalidString7 = userRegistration.ValidateEmail("abc()*@gmail.com");
        String testInvalidString8 = userRegistration.ValidateEmail("abc@%*.com");
        String testInvalidString9 = userRegistration.ValidateEmail("abc..2002@gmail.com");
        String testInvalidString10 = userRegistration.ValidateEmail("abc.@gmail.com");
        String testInvalidString11 = userRegistration.ValidateEmail("abc@abc@gmail.com");
        String testInvalidString12 = userRegistration.ValidateEmail("abc@gmail.com.1a");

        Assert.assertEquals("InValid",testValidString1);
        Assert.assertEquals("Valid",testValidString2);
        Assert.assertEquals("Valid",testValidString3);
        Assert.assertEquals("Valid",testValidString4);
        Assert.assertEquals("Valid",testValidString5);
        Assert.assertEquals("Valid",testValidString6);
        Assert.assertEquals("Valid",testValidString7);
        Assert.assertEquals("Valid",testValidString8);
        Assert.assertEquals("Valid",testValidString9);

        Assert.assertEquals("Invalid",testInvalidString1);
        Assert.assertEquals("Invalid",testInvalidString2);
        Assert.assertEquals("Invalid",testInvalidString2);
        Assert.assertEquals("Invalid",testInvalidString3);
        Assert.assertEquals("Invalid",testInvalidString4);
        Assert.assertEquals("Invalid",testInvalidString5);
        Assert.assertEquals("Invalid",testInvalidString6);
        Assert.assertEquals("Invalid",testInvalidString7);
        Assert.assertEquals("Invalid",testInvalidString8);
        Assert.assertEquals("Invalid",testInvalidString9);
        Assert.assertEquals("Invalid",testInvalidString10);
        Assert.assertEquals("Invalid",testInvalidString11);
        Assert.assertEquals("Invalid",testInvalidString12);
    }



}



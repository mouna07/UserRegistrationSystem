package com.BridgeLabz;



import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationGradleTest {

    static String Happy = null;

    public static void UC1() {
        UserRegistration userRegistration = new UserRegistration();
        String firstNameUserInput = userRegistration.UC1("Komal");
        //Assert Statement
        assertEquals(Happy, firstNameUserInput);
    }

    public static void UC2() {
        UserRegistration userRegistration = new UserRegistration();
        String lastNameUserInput = userRegistration.UC2("Shinde");
        //Assert Statement
        assertEquals(Happy, "lastNameUserInput");
    }

    public static void UC3() {
        UserRegistration userRegistration = new UserRegistration();
        String emailUserInput = userRegistration.UC3("abc.xyz@bl.co.in");
        //Assert Statement
        assertEquals(Happy, "emailUserInput");
    }

    public static void UC4() {
        UserRegistration userRegistration = new UserRegistration();
        String mobileUserInput = userRegistration.UC4("91 8562416354");
        //Assert Statement
        assertEquals(Happy, "mobileUserInput");
    }

    public static void UC5PasswordRule1() {
        UserRegistration userRegistration = new UserRegistration();
        String passwordUserInput = userRegistration.UC5toUC8("Komal");
        //Assert Statement
        assertEquals(Happy, "passwordUserInput");
t
    public static void UC6PasswordRule2() {
        UserRegistration userRegistration = new UserRegistration();
        String passwordUserInput = userRegistration.UC5toUC8("Komal");
        //Assert Statement
        assertEquals(Happy, "passwordUserInput");
    }

    public static void UC7PasswordRule3() {
        UserRegistration userRegistration = new UserRegistration();
        String passwordUserInput = userRegistration.UC5toUC8("Komal");
        //Assert Statement
        assertEquals(Happy, "passwordUserInput");
    }

    public static void UC8PasswordRule4() {
        UserRegistration userRegistration = new UserRegistration();
        String passwordUserInput = userRegistration.UC5toUC8("Komal");
        //Assert Statement
        assertEquals(Happy, "passwordUserInput");

    }

    public static void UC9() {
        UserRegistration userRegistration = new UserRegistration();
        boolean sampleEmailValidation1 = userRegistration.UC9("abc@yahoo.com");
        boolean sampleEmailValidation2 = userRegistration.UC9("abc-100@yahoo.com");
        boolean sampleEmailValidation3 = userRegistration.UC9("abc.100@yahoo.com");
        boolean sampleEmailValidation4 = userRegistration.UC9("abc111@abc.com");
        boolean sampleEmailValidation5 = userRegistration.UC9("abc-100@abc.net");
        boolean sampleEmailValidation6 = userRegistration.UC9("abc.100@abc.com.au");
        boolean sampleEmailValidation7 = userRegistration.UC9("abc@1.com");
        boolean sampleEmailValidation8 = userRegistration.UC9("abc@gmail.com.com");
        boolean sampleEmailValidation9 = userRegistration.UC9("abc+100@gmail.com");
        //Assert Statement
        assertEquals(true, "sampleEmailValidation1");
        assertEquals(true, "sampleEmailValidation2");
        assertEquals(true, "sampleEmailValidation3");
        assertEquals(true, "sampleEmailValidation4");
        assertEquals(true, "sampleEmailValidation5");
        assertEquals(true, "sampleEmailValidation6");
        assertEquals(true, "sampleEmailValidation7");
        assertEquals(true, "sampleEmailValidation8");
        assertEquals(true, "sampleEmailValidation9");
    }


}


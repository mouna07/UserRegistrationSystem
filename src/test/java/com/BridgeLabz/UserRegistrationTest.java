package com.BridgeLabz;



import org.junit.Assert;
import org.junit.Test;


class UserRegistrationeTest {

    static String Happy = null;

    public void UC1() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String firstNameUserInput = userRegistrationGradle.UC1("Komal");
        try {
            userRegistrationGradle.UC1(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid first name", e.getMessage());
        }
    }

    public static void UC2() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String lastNameUserInput = userRegistrationGradle.UC2("Shinde");
        try {
            userRegistrationGradle.UC2(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid last name", e.getMessage());
        }
    }

    public static void UC3() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String emailUserInput = userRegistrationGradle.UC3("abc.xyz@bl.co.in");
        try {
            userRegistrationGradle.UC3(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid email", e.getMessage());
        }
    }

    public static void UC4() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String mobileUserInput = userRegistrationGradle.UC4("91 8562416354");
        try {
            userRegistrationGradle.UC4(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid mobile number", e.getMessage());
        }
    }


    public static void UC5PasswordRule1() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
        try {
            userRegistrationGradle.UC5toUC8(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid password", e.getMessage());
        }
    }

    public static void UC6PasswordRule2() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
        try {
            userRegistrationGradle.UC5toUC8(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid password", e.getMessage());
        }

    public static void UC7PasswordRule3() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
        try {
            userRegistrationGradle.UC5toUC8(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid password", e.getMessage());
        }
    }

    public static void UC8PasswordRule4() throws UserRegistrationException {
        UserRegistration userRegistrationGradle = new UserRegistration();
        String passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
        try {
            userRegistrationGradle.UC5toUC8(Happy);
        } catch (UserRegistrationException e) {
            //Assert Statement
            assertEquals("Please enter valid password", e.getMessage());
        }




    public static void UC9() {
        UserRegistration userRegistrationGradle = new UserRegistration();
        boolean sampleEmailValidation1 = userRegistrationGradle.UC9("abc@yahoo.com");
        boolean sampleEmailValidation2 = userRegistrationGradle.UC9("abc-100@yahoo.com");
        boolean sampleEmailValidation3 = userRegistrationGradle.UC9("abc.100@yahoo.com");
        boolean sampleEmailValidation4 = userRegistrationGradle.UC9("abc111@abc.com");
        boolean sampleEmailValidation5 = userRegistrationGradle.UC9("abc-100@abc.net");
        boolean sampleEmailValidation6 = userRegistrationGradle.UC9("abc.100@abc.com.au");
        boolean sampleEmailValidation7 = userRegistrationGradle.UC9("abc@1.com");
        boolean sampleEmailValidation8 = userRegistrationGradle.UC9("abc@gmail.com.com");
        boolean sampleEmailValidation9 = userRegistrationGradle.UC9("abc+100@gmail.com");
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



}


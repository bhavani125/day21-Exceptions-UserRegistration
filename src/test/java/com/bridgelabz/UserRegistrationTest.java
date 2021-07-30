package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //Creating object for UserRegistration Class
    UserRegistration userRegistration=new UserRegistration();

    @Test
    public void givenFirstName_whenValid_thenReturnTrue() {
        try {
            //calling validateFirstName method
            boolean result = userRegistration.validateFirstName("Bhavani");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);
        }
    }
    @Test
    public void  givenLastName_whenValid_thenReturnTrue() {
        try {
            //calling validateLastName method
            boolean result = userRegistration.validateLastName("Girineni");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);
        }
    }
    @Test
    public void  givenEmailId_WhenValid_ShouldReturnTrue() {
        try {
            //calling validateEmailId method
            boolean result = userRegistration.validateEmailId("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);
        }
    }
    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue () {
        try {
            //calling validatePhoneNumber method
            boolean result = userRegistration.validatePhoneNumber("91 8341930630");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);
        }
    }
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        try {
            //calling validatePassword method
            boolean result = userRegistration.validatePassword("Bhavani@123");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);
        }
    }
    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        try {
            //calling validatePassword method
            boolean result = userRegistration.validatePassword("Bhavani@123");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);
        }
    }
}

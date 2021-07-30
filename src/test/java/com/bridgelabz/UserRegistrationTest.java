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
}

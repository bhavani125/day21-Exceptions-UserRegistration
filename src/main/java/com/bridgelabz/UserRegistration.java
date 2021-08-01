package com.bridgelabz;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String namePattern = "^[A-Z][a-z]{3,}$";
    String emailPattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    String phonePattern = "^[0-9]{2}[ ][0-9]{10}";
    String passwordPattern = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=.{8,})";

    //Creating validateFirstName Method
    public boolean validateFirstName(String name) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }

    //Creating validateLastName Method
    public boolean validateLastName(String name) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }

    //Creating validateEmailId Method
    public boolean validateEmailId(String email) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }

    //Creating validatePhoneNumber Method
    public boolean validatePhoneNumber(String number) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(number);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }

    //Creating validatePassword Method
    public boolean validatePassword(String password) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        } catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }

    //Creating validateSampleEmailId Method
    public boolean validateSampleEmailId() throws UserRegistrationException {
        String sampleEmail1 = "abc@yahoo.com";
        String sampleEmail2 = "abc-100@yahoo.com";
        String sampleEmail3 = "abc.100@yahoo.com";
        String sampleEmail4 = "abc111@abc.com";
        String sampleEmail5 = "abc-100@abc.net";
        String sampleEmail6 = "abc.100@abc.com.au";
        String sampleEmail7 = "abc@1.com";
        String sampleEmail8 = "abc@gmail.com.com";
        String sampleEmail9 = "abc+100@gmail.com";
        //Creating arrayList
        ArrayList<String> emailIdList = new ArrayList<String>();
        emailIdList.add(sampleEmail1);
        emailIdList.add(sampleEmail2);
        emailIdList.add(sampleEmail3);
        emailIdList.add(sampleEmail4);
        emailIdList.add(sampleEmail5);
        emailIdList.add(sampleEmail6);
        emailIdList.add(sampleEmail7);
        emailIdList.add(sampleEmail8);
        emailIdList.add(sampleEmail9);
        for (String emailId : emailIdList) {
            if (Pattern.matches(emailPattern, emailId)) {
                System.out.println(emailId + " - valid ");
                return true;
            } else {
                System.out.println(emailId + " - Invalid ");
            }
        }
        return false;
    }

    public boolean validateEmails(String email) {
        boolean result = Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email);
        return result;
    }
}
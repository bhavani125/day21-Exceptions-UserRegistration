package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String namePattern = "^[A-Z][a-z]{3,}$";
    String emailPattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    String phonePattern = "^[0-9]{2}[ ][0-9]{10}";
    //Creating validateFirstName Method
    public boolean validateFirstName(String name)throws UserRegistrationException {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        }
        catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }
    //Creating validateLastName Method
    public boolean validateLastName(String name) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        }
        catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }
    //Creating validateEmailId Method
    public boolean validateEmailId(String email) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        }
        catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }
    //Creating validatePhoneNumber Method
    public boolean validatePhoneNumber(String number) throws  UserRegistrationException{
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(number);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException("INPUT IS WRONG");
        }
        catch (UserRegistrationException e) {
            System.out.println(e.errorMessage);

        }
        return true;

    }
}

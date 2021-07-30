package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String namePattern = "^[A-Z][a-z]{3,}$";
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
}

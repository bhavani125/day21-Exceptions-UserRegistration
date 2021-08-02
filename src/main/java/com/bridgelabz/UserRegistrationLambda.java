package com.bridgelabz;
import java.util.regex.Pattern;

@FunctionalInterface
interface DataValidator{
  boolean validator(String pattern, String message);
}
public class UserRegistrationLambda {
    static String namePattern = "^[A-Z][a-z]{3,}$";
    static String emailPattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
    static String phonePattern = "^[0-9]{2}[ ][0-9]{10}";
    static String passwordPattern ="^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";

    public static void main(String[] args) {
        DataValidator validate = (String pattern, String message) ->
        Pattern.matches(pattern, message);
        System.out.println("FirstName is" + validate.validator(namePattern, "Bhavani"));
        System.out.println("LastName is" + validate.validator(namePattern, "Girineni"));
        System.out.println("EmailId is" + validate.validator(emailPattern, "girinenibhavani12@gmail.com"));
        System.out.println("PhoneNumber is" + validate.validator(phonePattern, "91 9989464121"));
        System.out.println("password is" + validate.validator(passwordPattern, "Bhavani@123"));
    }
}


/*      public void userValidation(){
        DataValidator firstName = () ->
        {
            Scanner sc = new Scanner(System.in);
            String namePattern = "^[A-Z][a-z]{3,}$";
            System.out.println("Enter your First name");
            String name = sc.next();
            Pattern pattern = Pattern.compile(namePattern);
            Matcher matcher = pattern.matcher(name);
            try {
                boolean result = matcher.matches();
                if (!result)
                    throw new UserRegistrationException("INPUT IS WRONG");
            } catch (UserRegistrationException e) {
                System.out.println(e.errorMessage);

            }
            return;
        };
        firstName.validator();
*/
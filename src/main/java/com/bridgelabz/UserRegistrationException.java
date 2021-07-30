package com.bridgelabz;

public class UserRegistrationException extends Throwable {
    String errorMessage;

    public UserRegistrationException(String message) {
        this.errorMessage=message;
    }
}

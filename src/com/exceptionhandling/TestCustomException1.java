package com.exceptionhandling;

// class representing custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class TestCustomException1 {

    // method to check the age
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    // main method
    public static void main(String[] args) {
        try {
            // calling the method
            validate(13);
        } catch (InvalidAgeException exception) {
            System.out.println("Caught the exception");
            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + exception.getMessage());
        }

        System.out.println("rest of the code...");
    }
}
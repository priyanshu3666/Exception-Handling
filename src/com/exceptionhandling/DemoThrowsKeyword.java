package com.exceptionhandling;

public class DemoThrowsKeyword {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }
        catch (IllegalAccessException exception)
        {
            System.out.println("Caught : " + exception.getMessage());
        }
    }
}

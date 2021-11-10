package com.exceptionhandling;

/**
 * If the superclass method does not declare an exception, subclass overridden method cannot declare the
 * checked exception but can declare unchecked exception.
 */

class Parent {
    void msg() {
        System.out.println("parent method");
    }
}

public class MethodOverridingWithException extends Parent {
    public static void main(String[] args) {
        Parent parentObj = new MethodOverridingWithException();
        parentObj.msg();
    }
    @Override
    void msg() throws ArithmeticException {
        System.out.println("child method");
    }
}



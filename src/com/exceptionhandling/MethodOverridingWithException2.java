package com.exceptionhandling;

/**
*  If the superclass method declares an exception,
* subclass overridden method can declare the same subclass exception or no exception but cannot declare
 * parent exception.
 */


class Parent1 {
    void msg() throws Exception {
        System.out.println("parent method");
    }
}

public class MethodOverridingWithException2 extends Parent1 {
    public static void main(String[] args) {
        Parent1 p = new MethodOverridingWithException2();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }

    void msg() throws Exception {
        System.out.println("child method");
    }
}


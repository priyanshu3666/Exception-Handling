package com.exceptionhandling;

// demostrating exception chaining
public class ChainedExceptionDemo {
    static  void  method1()
    {
        // create an exception
        NullPointerException nullPointerException = new NullPointerException("top layer");

        // add a cause
        nullPointerException.initCause(new ArithmeticException("cause"));
        throw nullPointerException;
    }

    public static void main(String[] args) {
        try {
            method1();
        }
        catch (NullPointerException exception)
        {
            // displaying top level exception
            System.out.println("Caught : " + exception.getMessage());

            // displaying cause exception
            System.out.println("Original cause : " + exception.getCause().getMessage());
        }
    }
}

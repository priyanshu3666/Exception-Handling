package com.exceptionhandling;

public class DemoThrowKeyword {
    static  void  demo ()  {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException exception)
        {
            System.out.println(" caught inside demo method");
            throw exception;
        }
    }

    public static void main(String[] args) {
        try {
            demo();
        }
        catch (NullPointerException exception)
        {
            System.out.println("Recaught :" + exception.getMessage());
        }
    }
}

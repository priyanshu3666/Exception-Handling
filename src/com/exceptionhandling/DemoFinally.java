package com.exceptionhandling;

public class DemoFinally {
    // throws an exception  out of the method
    static  void   method1(){
        try {
            System.out.println("inside method1");
            throw new RuntimeException("demo");
        }
        finally {
            System.out.println("method1 finally");
        }
    }

    // Return from within a try block
    static  void  method2(){
        try {
            System.out.println("inside method2");
            return;
        }
        finally {
            System.out.println("method2 finally ");
        }
    }

    //  execute a try block normally
    static   void   method3(){
        try {
            System.out.println("inside method3");
        }
        finally {
            System.out.println("method3 finally");
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception exception)
        {
            System.out.println("Exception caught");
        }
        method2();
        method3();
    }
}

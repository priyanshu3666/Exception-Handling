package com.exceptionhandling;

public class JavaExceptionExamples {
      public static void main(String[] args) {
            try {
                //code that may raise exception
                int data = 100 / 0;
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
            }
            try {

                String s = null;
                System.out.println(s.length());//NullPointerException

            } catch (NullPointerException exception) {
                System.out.println(exception.getMessage());
            }

            try {

                String s = "abc";
                int i = Integer.parseInt(s);//NumberFormatException
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
            }

            try {
                int[] a = new int[5];
                a[10] = 50; //ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(exception.getMessage());
            }


            System.out.println("rest of the code...");
        }
}


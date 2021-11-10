package com.exceptionhandling;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);

            try {
                //nested try block
                if (a == 1) a = a / (a - a);

                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99; // generate an outOfBoundsException
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Array index out of bound " + exception.getMessage());
            }
        }
            catch (ArithmeticException exception){
                System.out.println("Divide By Zero :" + exception);
            }
        }
    }


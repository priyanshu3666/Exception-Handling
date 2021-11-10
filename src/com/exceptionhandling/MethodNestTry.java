package com.exceptionhandling;

public class MethodNestTry {
    static  void nestTry(int a){
        try {
            //nested try block
            if (a == 1) a = a / (a - a);   // division by zero

            if (a == 2) {
                int c[] = {1};
                c[42] = 99; // generate an outOfBoundsException
            }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index out of bound " + exception.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b =42/0;
            System.out.println( " a = " +a);
            nestTry(a);
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Divide by  0 : " +exception.getMessage());
        }
    }
}



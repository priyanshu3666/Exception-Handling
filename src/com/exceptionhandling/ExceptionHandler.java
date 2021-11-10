package com.exceptionhandling;

import java.util.Random;

public class ExceptionHandler {
    public static void main(String[] args) {
        int a =0 ,b=0 ,c=0;
        Random random = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            }
            catch (ArithmeticException exception)
            {
                System.out.println("Division by Zero");
                a = 0  ;  //   set a to Zero
            }
            System.out.println("a :  "+a);
        }

    }
}

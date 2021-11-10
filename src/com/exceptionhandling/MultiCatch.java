package com.exceptionhandling;

public class MultiCatch {
    public static void main(String[] args) {
        int num = 10 , num2 = 0;
        int[] values = {1,2,3};

        try {
            int result = num/num2;       // generates an ArithmeticException

            values [10] =16;             // generate an ArrayIndexOutOfBoundsException

        }
        catch (ArrayIndexOutOfBoundsException| ArithmeticException  exception) //this catch clause catch both exceptions
        {
            System.out.println("Exception caught :" + exception.getMessage());
        }

        System.out.println("After multi catch");
    }
}

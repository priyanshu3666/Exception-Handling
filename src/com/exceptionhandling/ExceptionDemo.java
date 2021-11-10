package com.exceptionhandling;

 class MyException extends  Exception{
    private int detail;

    MyException(int a){
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException [" + detail +" ] ";
    }
}

public class  ExceptionDemo{
    static void compute(int a) throws  MyException{
        System.out.println("Called compute("+ a + " ) ");
        if (a>10)
        {
            System.out.println("Normal Exit");
            throw new MyException(a);
        }

    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }
        catch (MyException myException)
        {
            System.out.println("Caught " +myException);
        }
    }
    
}

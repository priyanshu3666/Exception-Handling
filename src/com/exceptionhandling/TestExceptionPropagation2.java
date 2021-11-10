package com.exceptionhandling;

class TestExceptionPropagation2{
    void method1()
    {
        throw new IndexOutOfBoundsException();//checked exception
    }
    void method2()
    {
        method1();
    }
    void method3()
    {
        try{
            method2();
        }
        catch(Exception e)
        {
            System.out.println("exception handled");
        }
    }
    public static void main(String[] args){
        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
        obj.method3();
        System.out.println("normal flow");
    }
}
package com.exceptionhandling;

import java.io.IOException;

class DeviceManager {
    void method()throws IOException{
        throw new IOException("device error");
    }
}

public class TestThrows {
    public static void main(String args[]){
        try{
            DeviceManager deviceManagerObj=new DeviceManager();
            deviceManagerObj.method();

        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }
}


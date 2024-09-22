package com.myApp.project1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile (){
        System.out.println("Compiling code with bug  404 code from Laptop Class");
    }

}

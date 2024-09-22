package com.myApp.project1;

import jakarta.annotation.Priority;
import org.springframework.stereotype.Component;

@Component
@Priority(1)
public class Desktop implements Computer{
    public void compile(){
        System.out.println("Compiling With Computer ");
    }
}

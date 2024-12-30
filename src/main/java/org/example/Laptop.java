package org.example;

import org.springframework.stereotype.Component;

@Component("com1")
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop created");
    }

    public void compile(){
        System.out.println("Compile Laptop");
    }
}

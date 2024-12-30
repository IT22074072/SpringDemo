package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("com1")
@Primary
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop created");
    }

    public void compile(){
        System.out.println("Compile Laptop");
    }
}

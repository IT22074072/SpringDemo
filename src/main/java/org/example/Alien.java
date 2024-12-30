package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //you are used by spring
@Scope("prototype")
public class Alien {

    @Value("1")
    private int age;

    //@Qualifier("com1") //default starts with simple letter of the class or name a bean
    private Computer com;

    public Alien(){
        System.out.println("Alien object created");
    }

//    public Alien(int age, Computer com){
//        System.out.println("Parameterized Alien constructor called");
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("com2") //Qualifier gets ahead of laptop
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding");
        com.compile();
    }
}

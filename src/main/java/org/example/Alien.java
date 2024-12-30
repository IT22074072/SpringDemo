package org.example;

public class Alien {

    private int age;
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

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding");
        com.compile();
    }
}

package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //in this line created the object
        Alien obj1 = (Alien) context.getBean("alien"); //in this line just getting the object
        //obj1.setAge(1);
        System.out.println(obj1.getAge());

        obj1.code();



    }
}

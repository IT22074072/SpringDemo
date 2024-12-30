package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //in this line created the object
        Alien obj = (Alien) context.getBean("alien1"); //in this line just getting the object
        obj.code();

    }
}

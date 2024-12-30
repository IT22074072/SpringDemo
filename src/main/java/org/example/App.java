package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //in this line created the object
//        Alien obj1 = (Alien) context.getBean("alien"); //in this line just getting the object
//        obj1.age=1;
//        System.out.println(obj1.age);
//
//        //obj1.code();
//
//        Alien obj2 = (Alien) context.getBean("alien"); //in this line just getting the object-even though we get bean 2 times, it will create only one object and using that ref calling code method 2 times
//        System.out.println(obj2.age);

        //obj2.code();

    }
}

package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = context.getBean(Alien.class); //in this line just getting the object
        System.out.println(obj1.getAge()); //age with 1
        obj1.code();


        Alien obj2 = context.getBean(Alien.class); //in this line just getting the object
        obj2.setAge(21);
        System.out.println(obj2.getAge());  //age with 21 - two different objects from earlier
        System.out.println(obj1.getAge());


//        Desktop dt = context.getBean("desktop",Desktop.class);
//        dt.compile();
//
//
//        Desktop dt1 = context.getBean("desktop",Desktop.class);
//        dt1.compile();



//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //in this line created the object
//        Alien obj1 = context.getBean("alien", Alien.class); //in this line just getting the object
//        //obj1.setAge(1);
//        System.out.println(obj1.getAge());
//
//        obj1.code();



    }
}

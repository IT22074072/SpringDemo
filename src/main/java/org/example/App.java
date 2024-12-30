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

        Desktop dt = context.getBean(Desktop.class);
        dt.compile();





//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //in this line created the object
//        Alien obj1 = context.getBean("alien", Alien.class); //in this line just getting the object
//        //obj1.setAge(1);
//        System.out.println(obj1.getAge());
//
//        obj1.code();



    }
}

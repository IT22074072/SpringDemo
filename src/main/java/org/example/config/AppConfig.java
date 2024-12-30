package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean(name = {"com2", "jin", "rm"})
    @Bean
    //@Scope("prototype")  //now will create as much as objects want(default-singleton(only one object created))
    public Desktop desktop(){ //default bean name is method name
        return new Desktop();
    }

    @Bean
    public Alien alien(@Qualifier("laptop") Computer com){
        Alien obj = new Alien();
        obj.setAge(1);
        obj.setCom(com); //there are two computers laptop or desktop- to say which one, use primary or Qualifier
        return obj;

    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
}

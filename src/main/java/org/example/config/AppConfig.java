package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean(name = {"com2", "jin", "rm"})
    @Bean
    public Desktop desktop(){ //default bean name is method name
        return new Desktop();
    }

}

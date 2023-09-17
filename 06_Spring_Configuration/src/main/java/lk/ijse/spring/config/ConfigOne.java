package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigOne {
    public ConfigOne(){
        System.out.println("ConfigOne: Instantiated");
    }
}

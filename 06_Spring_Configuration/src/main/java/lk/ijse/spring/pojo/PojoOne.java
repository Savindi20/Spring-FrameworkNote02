package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PojoOne{
    public PojoOne(){
        System.out.println("PojoOne: Instantiated");
    }
}

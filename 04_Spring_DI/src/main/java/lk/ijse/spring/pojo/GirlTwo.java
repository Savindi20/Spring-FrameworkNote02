package lk.ijse.spring.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GirlTwo implements GoodGirl {
    public GirlTwo(){
        System.out.println("GirlTwo: Instantiated");
    }

    @Override
    @Primary
    public void chat(){
        System.out.println("GirlTwo: hello hello");
    }

}
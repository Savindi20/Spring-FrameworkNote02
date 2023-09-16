package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class GirlOne implements GoodGirl {
    public GirlOne(){
        System.out.println("GirlOne: Instantiated");
    }

    @Override
    public void chat(){
        System.out.println("GirlOne: hello hello");
    }

}

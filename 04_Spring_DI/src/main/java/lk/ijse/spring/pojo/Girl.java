package lk.ijse.spring.pojo;

import org.springframework.stereotype.Component;

@Component
public class Girl {
    public Girl(){
        System.out.println("Girl: Instantiated");
    }

    public void chat(){
        System.out.println("hello hello");
    }
}

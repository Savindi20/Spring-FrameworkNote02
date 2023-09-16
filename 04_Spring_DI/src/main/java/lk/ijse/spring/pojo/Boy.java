package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
    GoodGirl girl;

    public Boy(){
        System.out.println("Boy: Instantiated");
    }

    public void chatWithGirl(){
//       Girl girl = new Girl(); don't creat object
        girl.chat();
    }

}

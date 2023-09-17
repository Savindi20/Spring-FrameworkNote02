package lk.ijse.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

//    @Autowired
    SuperB superB; // property injection

//    @Autowired
    public A(SuperB s){
//        this.superB = s; // constructor injection
        System.out.println("A: Instantiated");
    }

    @Autowired
    public void setInjection(SuperB s){
        this.superB =s ; // setter method injection
    }

    public void test(){
        superB.methodUsedByA();
    }
}

package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
//    public Customer(){
//        System.out.println("DefaultCustomer: Instantiated ");
//    }


    //Wht you can assign with @Value annotation
    //Primitive data types
    //String Data
    //Arrays

//    public Customer(@Value("IJSE") String name){
//        System.out.println("Customer: Instantiated "+name);
//    }

//    public Customer(@Value("10") int age){
//        System.out.println("Customer: Instantiated "+age);
//    }

    public Customer(@Value("Amal, Kamal, Nimal") String names[]){
        System.out.println("Customer: Instantiated ");
        for (String name : names){
            System.out.println(name);
        }
    }
}

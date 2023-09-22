package lk.ijse.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired(required = false)// mehem thibboth spring run krnne parameter count eka vadima constructor ekaii
    public Customer(@Value("Amal, Kamal, Nimal") String names[], @Value("10") int i, @Value("20") int c){
        System.out.println("Customer: Instantiated ");
        for (String name : names){
            System.out.println(name);
        }
    }

    @Autowired(required = false)
    public Customer(@Value("Amal") String name, @Value("10") int i){
        System.out.println("Customer: Instantiated "+name);
    }
}

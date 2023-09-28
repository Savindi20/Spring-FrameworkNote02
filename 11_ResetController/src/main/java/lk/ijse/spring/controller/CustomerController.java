package lk.ijse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    public CustomerController() {
        System.out.println("Customer Controller");
    }

    @GetMapping
    public String testOne(){ //we can return any compatible data type with rest controller
        //no need viewResolvers
        return "Hello Customer Mapping";
    }

    @GetMapping
    public String testTwo(){ //this is duplicate(Ambiguous) mapping
        //same controller there two methods for get method
        //so we can't do that
        //we have to learn mapping spec to resolve this problem
        return "Hello Customer Mapping";
    }
}

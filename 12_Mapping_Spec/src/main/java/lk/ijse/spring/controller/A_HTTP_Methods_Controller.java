package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/http")
public class A_HTTP_Methods_Controller {

    //How to handle http request with Spring
    //For different HTTP methods

    //get
    @GetMapping
    public String getMapping1(){
        return "Get Mapping Invoked 1";
    }

    //this is ambiguous
//    @GetMapping
//    public String getMapping2(){
//        return "Get Mapping Invoked 2";
//    }

    //post
    @PostMapping
    public String postMapping1(){
        return "Post Mapping Invoked";
    }


    //put
    @PutMapping
    public String putMapping(){
        return "Put Mapping Invoked";
    }


    //delete
    @DeleteMapping
    public String deleteMapping(){
        return "Delete Mapping Invoked";
    }
}

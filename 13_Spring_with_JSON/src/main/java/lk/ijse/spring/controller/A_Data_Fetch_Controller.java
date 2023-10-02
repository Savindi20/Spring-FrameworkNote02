package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fetch")
public class A_Data_Fetch_Controller {
    //So there are many ways that we can pass data between
    //client to server
    //01 Query String
    //02 X-WWW-Form-Url-Encoded
    //03 JSON
    //04 Path variables with Path Segments


    //01 Query String
    //how to access query string data with Spring
    @GetMapping(params = {"id","name"})
    public String receiveDataWithQueryString(String id,@RequestParam String name){
        return "Query String data : "+id+", "+name;
    }

}

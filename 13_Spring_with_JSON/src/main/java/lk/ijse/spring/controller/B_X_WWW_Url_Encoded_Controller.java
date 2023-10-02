package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/form")
public class B_X_WWW_Url_Encoded_Controller {
    //So there are many ways that we can pass data between
    //client and server
    //01 Query String
    //02 X-WWW-Form-Url-Encoded
    //03 JSON
    //04 Path variables with Path Segments

    //02 X-WWW-Form-Url-Encoded
    //How to access above type data from spring
    //@Model Attribute


    //This will catch x-www-form-url-encoded data without any issue
    //But you have to consider the key names and parameter name
    //front end id=C001 -> String id (key and param name should be same)
    @PostMapping(path = "/a")
    public String receiveDataWithFormData1(String id,String name,String address){
        return "X-WWW-Form-URL-Encoded-Data : "+id+" "+name+" "+address;
    }


    //if we have more data from the front end we can use encapsulated object to fetch
    //the data directly to the object
    //here we can use @ModelAttribute annotation - this is known as a model attribute
    //But it is not a required annotation like @RequestPram
    //Supporting data types (Query String & x-www-form-url-encoded)
    @PostMapping
    public String receiveDataWithFormData2(@ModelAttribute CustomerDTO dto){
        return "X-WWW-Form-URL-Encoded-Data : "+dto.toString();
    }

}

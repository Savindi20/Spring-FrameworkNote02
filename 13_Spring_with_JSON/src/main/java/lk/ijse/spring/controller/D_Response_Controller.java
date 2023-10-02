package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/response")
public class D_Response_Controller {
    //So how to send back data with JSON
    //In java EE we use Json Processing. in here.?

    //ResponseUtil
    //@ResponseStatus(HttpStatus.CREATED)

    @GetMapping
    public ArrayList<CustomerDTO> sendJsonData(){
        ArrayList<CustomerDTO> allCustomers= new ArrayList<>();
        allCustomers.add(new CustomerDTO("C001","Diman","Galle",1000,"1199",null));
        allCustomers.add(new CustomerDTO("C002","Kamal","Mathara",2000,"1199",null));
        allCustomers.add(new CustomerDTO("C003","Iman","Panadura",4000,"1199",null));
        allCustomers.add(new CustomerDTO("C004","Ushan","Colombo",5000,"1199",null));
        return allCustomers;
    }

    @PutMapping
    public CustomerDTO sendJsonData(@RequestBody CustomerDTO dto){
       return dto;
    }

}

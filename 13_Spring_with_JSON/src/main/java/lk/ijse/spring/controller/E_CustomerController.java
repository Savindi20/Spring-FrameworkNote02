package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/customer")
public class E_CustomerController {

    //add (POST)
    //delete (DELETE)
    //update (PUT)
    //search (GET)
    //get_all (GET)

    //every response should return a json object including state,message and data
    //return

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseUtil addCustomer(@RequestBody CustomerDTO dto) {
            if (dto.getId().equals("C001")) throw new RuntimeException("This is a bad Customer, So you can't add this person.");
            return new ResponseUtil("Ok", "Successfully Added", dto);
    }

    @DeleteMapping(params = "id")
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        if (id.endsWith("C001"))throw new RuntimeException("This customer cannot deleted.!");
        return new ResponseUtil("Ok", "Successfully Delete", id);
    }


    @PutMapping
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO dto) {
        if (dto.getId().equals("C001"))throw new RuntimeException("This is a bad Customer, So you can't update this customer.");
        return new ResponseUtil("Ok", "Successfully Updated", dto);
    }

    @GetMapping(params = "id")
    public ResponseUtil searchCustomer(@RequestParam String id) {
        CustomerDTO customer = new CustomerDTO("C001", "Ushan", "Mathara", 1000, "1199", null);
        return new ResponseUtil("Ok", "Successfully Searched", customer);
    }


    @GetMapping
    public ResponseUtil getAllCustomers() {
        ArrayList<CustomerDTO> allCustomers= new ArrayList<>();
        allCustomers.add(new CustomerDTO("C001","Diman","Galle",1000,"1199",null));
        allCustomers.add(new CustomerDTO("C002","Kamal","Mathara",2000,"1199",null));
        allCustomers.add(new CustomerDTO("C003","Iman","Panadura",4000,"1199",null));
        allCustomers.add(new CustomerDTO("C004","Ushan","Colombo",5000,"1199",null));
        return new ResponseUtil("Ok","Successfully Loaded",allCustomers);
    }

}

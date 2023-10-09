package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping
    public void addCustomer(CustomerDTO dto){
        service.addCustomer(dto);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCustomer(String id){
        service.deleteCustomer(id);
    }

    @GetMapping
    public List<CustomerDTO> getAllCustomer(){
        return service.getAllCustomer();
    }

    @GetMapping(params = {"id"})
    public CustomerDTO findCustomer(String id){
         return service.findCustomer(id);
    }

    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO c){
        service.updateCustomer(c);
    }
}

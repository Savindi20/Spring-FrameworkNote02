package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {



    @PostMapping
    public void addCustomer(Customer dto){
        customerDAO.save(dto);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCustomer(String id){
        customerDAO.deleteById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerDAO.findAll();
    }

    @GetMapping(params = {"id"})
    public Customer findCustomer(String id){
         return customerDAO.findById(id).get();
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer c){
        customerDAO.save(c);
    }
}

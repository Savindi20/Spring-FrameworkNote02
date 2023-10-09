package lk.ijse.spring.service.impl;

import lk.ijse.spring.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional// AOP
public class CustomerServiceImpl implements CustomerService {
    public CustomerServiceImpl(){
        System.out.println("CustomerServiceImpl Instantiated");
    }
}

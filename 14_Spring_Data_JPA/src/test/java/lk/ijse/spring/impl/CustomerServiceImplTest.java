package lk.ijse.spring.impl;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration // create testing context
@ContextConfiguration(classes = {WebRootConfig.class}) //load configurations which wanted for test context
@ExtendWith(SpringExtension.class)
class CustomerServiceImplTest {

    @Autowired
    CustomerService service;

    @Test
    void addCustomer() {
//        service.addCustomer();
    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void getAllCustomer() {
    }

    @Test
    void findCustomer() {
    }

    @Test
    void updateCustomer() {
    }
}
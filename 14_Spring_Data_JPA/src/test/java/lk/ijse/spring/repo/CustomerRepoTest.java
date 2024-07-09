package lk.ijse.spring.repo;

import lk.ijse.spring.config.WebRootConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.math.BigDecimal;
import java.util.List;

@WebAppConfiguration // create testing context
@ContextConfiguration(classes = {WebRootConfig.class}) //load configurations which wanted for test context
@ExtendWith(SpringExtension.class) //We have to use Jupiter with Spring Test as a vendor
class CustomerRepoTest {

    @Autowired
    CustomerRepo repo;

    @Test
    public void testGetAllCustomer(){
        List<Customer> all = repo.findAll();
        for (Customer customer : all) {
            System.out.println(customer.toString());
        }
    }

    @Test
    public void testAddCustomer(){
        Customer customer = new Customer("C004", "Iman", "Galle", new BigDecimal(100.00));
        repo.save(customer);
    }


    @Test
    public void queryMethodOne(){
        List<Customer> galle = repo.findCustomerByAddress("Galle");
        for (Customer customer : galle) {
            System.out.println(customer.toString());
        }

    }

    @Test
    public void queryMethodTwo(){
//        Customer mathara = repo.readByAddress("Mathara");
//        System.out.println(mathara.toString());

//        Customer mathara = repo.getByAddress("Mathara");
//        System.out.println(mathara.toString());

//        Customer mathara = repo.queryByAddress("Mathara");
//        System.out.println(mathara.toString());

//        Long galle = repo.countByAddress("Galle");
//        System.out.println(galle);

//        List<Customer> allCustomers = repo.getAllCustomers3();
//        for (Customer allCustomer : allCustomers) {
//            System.out.println(allCustomer.toString());
//        }

        Customer customer = repo.searchCustomerWithName2("Ushan","Mathara");
        System.out.println(customer);
    }




}
package lk.ijse.spring.config;

import lk.ijse.spring.controller.CustomerController;
import lk.ijse.spring.pojo.SpringBeanOne;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
//@ComponentScan(basePackages = {"lk.ijse.spring.pojo","lk.ijse.spring.controller"})
@ComponentScan(basePackageClasses = {CustomerController.class, SpringBeanOne.class})
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig: Instantiate");
    }
}

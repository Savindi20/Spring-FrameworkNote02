package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JPAConfig.class})
public class WebRootConfig {
    //this Config class is assigned for pojo's which is processing
    //DAOs and Business of the application

   public WebRootConfig(){
       System.out.println("WebRootConfig : Instantiated");
   }

}

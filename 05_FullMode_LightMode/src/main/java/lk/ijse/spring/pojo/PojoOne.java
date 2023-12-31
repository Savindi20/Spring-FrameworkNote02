package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoOne(){
        System.out.println("PojoOne: Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoOne: Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne: BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne: Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne: Initializing Bean: Bean is Ready for Use");
        System.out.println("============================================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoOne: Destroyed");
    }

    //Light Mode
    @Bean
    public PojoTwo pojoTwo(){
        //inter-Bean dependencies invocation
        PojoThree pojoThree1 = pojoThree(); // in here they creat simple object
        PojoThree pojoThree2 = pojoThree(); // in here they creat simple object
        System.out.println(pojoThree1); // two links
        System.out.println(pojoThree2); // two links

        return new PojoTwo();
    }

    @Bean
    public PojoThree pojoThree(){
        return new PojoThree();
    }
}

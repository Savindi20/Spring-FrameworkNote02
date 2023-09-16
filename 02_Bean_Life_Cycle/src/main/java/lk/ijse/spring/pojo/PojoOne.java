package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware {
    public PojoOne(){
        System.out.println("PojoOne: Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("PojoOne: Bean Name Aware: "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoOne: BeanFactory Aware");
    }
}

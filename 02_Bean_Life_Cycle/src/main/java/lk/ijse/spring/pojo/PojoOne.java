package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PojoOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
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

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoOne: Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoOne: Initializing Bean: Bean is Ready for Use");
    }
}

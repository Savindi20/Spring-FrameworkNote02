package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PojoTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public PojoTwo(){
        System.out.println("PojoTwo: Instantiated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("PojoTwo: Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("PojoTwo: BeanFactory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("PojoTwo: Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("PojoTwo: Initializing Bean: Bean is Ready for Use");
        System.out.println("============================================");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("PojoTwo: Destroyed");
    }
}

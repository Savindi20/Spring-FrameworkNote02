package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.PojoOne;
import lk.ijse.spring.pojo.PojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        PojoOne bean1 = ctx.getBean(PojoOne.class);
        System.out.println(bean1);

        PojoTwo bean = ctx.getBean(PojoTwo.class);
        System.out.println(bean);

    }
}

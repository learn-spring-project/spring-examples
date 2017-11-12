package spring.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/11/13.
 */
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationCfg.class);
        Sleepable person = (Sleepable)applicationContext.getBean("person");
        person.sleep();
    }
}

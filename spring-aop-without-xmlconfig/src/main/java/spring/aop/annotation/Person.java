package spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/13.
 */
@Component("person")
public class Person  implements  Sleepable{
    public void sleep() {
            System.out.println("----Persoon----: Sleepable");
    }
}

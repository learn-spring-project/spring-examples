package spring.aop.pojo;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/12.
 */
//@Service
public class Person implements  Sleepable {
    public void sleep() {
        System.out.println("----Persoon----: Sleepable");
    }
}

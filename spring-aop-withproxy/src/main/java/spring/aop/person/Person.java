package spring.aop.person;

import spring.aop.Sleepable;

/**
 * Created by Administrator on 2017/11/12.
 */
public class Person implements Sleepable {
    public void sleep() {
        System.out.println("----Persoon----");
    }
}

package spring.aop.pojo;

/**
 * Created by Administrator on 2017/11/12.
 */
public class SleepHelper {
    public void beforeSleep(){
        System.out.println("睡觉前要脱衣服!");
    }

    public void afterSleep(){
        System.out.println("睡醒了要穿衣服！");
    }
}

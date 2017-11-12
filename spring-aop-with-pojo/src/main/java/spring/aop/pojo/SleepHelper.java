package spring.aop.pojo;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Administrator on 2017/11/12.
 */
public class SleepHelper {
    public void beforeSleep(JoinPoint jp){
        System.out.println("睡觉前要脱衣服!");
        System.out.println(jp.getSignature().getName());
    }

    public void afterSleep(JoinPoint jp){
        System.out.println("睡醒了要穿衣服！");
        System.out.println(jp.getSignature().getName());
    }
}

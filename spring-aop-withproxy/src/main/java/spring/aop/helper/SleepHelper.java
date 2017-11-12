package spring.aop.helper;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/11/12.
 */
public class SleepHelper implements MethodBeforeAdvice,AfterReturningAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("睡觉前要脱衣服！");
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("起床后要穿衣服！");
    }
}

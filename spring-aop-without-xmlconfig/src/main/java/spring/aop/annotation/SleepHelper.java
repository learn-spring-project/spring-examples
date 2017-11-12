package spring.aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/12.
 */
@Component("sleepHelper")
@Aspect
public class SleepHelper {
    public SleepHelper(){

    }

    //execution(<修饰符模式>?<返回类型模式><方法名模式>(<参数模式>)<异常模式>?)切点函数
    @Pointcut("execution(* *.sleep())")
    public void sleeppoint(){}

    @Before("sleeppoint()")
    public void beforeSleep(){
        System.out.println("睡觉前要脱衣服!");
    }

    @AfterReturning("sleeppoint()")
    public void afterSleep(){
        System.out.println("睡醒了要穿衣服！");
    }

/*    //当抛出异常时被调用
    public void doThrowing(JoinPoint point, Throwable ex)
    {
        System.out.println("doThrowing::method "
                + point.getTarget().getClass().getName() + "."
                + point.getSignature().getName() + " throw exception");
        System.out.println(ex.getMessage());
    }*/
}

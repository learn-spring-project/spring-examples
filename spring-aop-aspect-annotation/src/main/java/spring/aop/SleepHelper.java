package spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Administrator on 2017/11/12.
 */
@Aspect
public class SleepHelper {
    public SleepHelper(){

    }

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

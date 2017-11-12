package spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring.aop.Sleepable;

/**
 * Created by Administrator on 2017/11/12.
 */
public class Test {
public  static  void main(String[] args){
    @SuppressWarnings("resource")
    //如果是web项目，则使用注释的代码加载配置文件，这里是一般的Java项目，所以使用下面的方式
            //ApplicationContext appCtx = new ClassPathXmlApplicationContext("application.xml");
            ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
    Sleepable me = (Sleepable)appCtx.getBean("proxy");
    me.sleep();
}

}

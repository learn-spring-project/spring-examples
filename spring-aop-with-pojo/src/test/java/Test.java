import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.aop.pojo.Sleepable;

/**
 * Created by Administrator on 2017/11/12.
 */
@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test {
    @Autowired
    ApplicationContext appCtx;

    @org.junit.Test
    public  void test()
    {
        Sleepable person = (Sleepable)appCtx.getBean("person");
        person.sleep();
    }
}

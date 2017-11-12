package spring.aop.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/11/13.
 */

/**
 * 该类的每一部分内容基本都与xml 配置有一对一的关系，请看注释，这样做要比写xml方便，但不便发布后修改
 */
@Configuration  //用于表示当前类为容器的配置类，类似<beans/>
@ComponentScan(basePackages="spring.aop.annotation")  //扫描的范围，相当于xml配置的结点<context:component-scan/>
@EnableAspectJAutoProxy(proxyTargetClass=true)  //自动代理，相当于<aop:aspectj-autoproxy proxy-target-class="true"></aop:aspectj-autoproxy>
public class ApplicationCfg {

}
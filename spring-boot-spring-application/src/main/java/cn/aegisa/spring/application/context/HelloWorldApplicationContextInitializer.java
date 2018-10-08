package cn.aegisa.spring.application.context;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 9/30/2018 2:03 PM
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C c) {
        ConfigurableListableBeanFactory beanFactory = c.getBeanFactory();
        System.out.println("HelloWorld: " + c.getId());
    }
}

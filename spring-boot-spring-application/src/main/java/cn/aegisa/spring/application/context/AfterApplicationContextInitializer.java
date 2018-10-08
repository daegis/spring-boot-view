package cn.aegisa.spring.application.context;

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
public class AfterApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C>, Ordered {
    @Override
    public void initialize(C c) {
        System.out.println("after configurable.id = " + c.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

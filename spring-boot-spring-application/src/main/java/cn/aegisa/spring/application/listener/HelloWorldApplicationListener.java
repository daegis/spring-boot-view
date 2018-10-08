package cn.aegisa.spring.application.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 10/8/2018 3:54 PM
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Hello World Listener：" + event.getApplicationContext().getId() + " timestamp:" + event.getTimestamp());
    }
}

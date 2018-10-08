package cn.aegisa.springbootview.bootstrap;

import cn.aegisa.springbootview.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 2:17 PM
 */
@ComponentScan(basePackages = "cn.aegisa.springbootview.service")
@EnableHelloWorld
public class CustomSpringbootStarter {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(CustomSpringbootStarter.class);
        ConfigurableApplicationContext context = builder.web(WebApplicationType.NONE).run(args);
        String service = context.getBean("helloWorld", String.class);
        System.out.println(service);
        context.close();
    }
}

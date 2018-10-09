package cn.aegisa.spring.application;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Using IntelliJ IDEA.
 * 自定义引导类
 *
 * @author XIANYINGDA at 9/29/2018 2:42 PM
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        ConfigurableApplicationContext context = builder
                .sources(SpringApplicationContextBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println(context.getClass().getName());
        System.out.println(context.getEnvironment().getClass().getName());

        context.close();
    }
}

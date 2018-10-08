package cn.aegisa.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;

/**
 * Using IntelliJ IDEA.
 * 自定义引导类
 *
 * @author XIANYINGDA at 9/29/2018 2:42 PM
 */
@SpringBootApplication
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
        // SpringApplication.run(SpringApplicationBootstrap.class, args);
        SpringApplication application = new SpringApplication();
        application.setSources(new HashSet<String>() {{
            add(SpringApplicationBootstrap.class.getName()); // 设置bean的源 可以设置多个 可以是xml配置文件
        }});
        application.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = application.run(args);

    }
}

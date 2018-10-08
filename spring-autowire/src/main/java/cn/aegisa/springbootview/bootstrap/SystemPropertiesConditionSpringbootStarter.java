package cn.aegisa.springbootview.bootstrap;

import cn.aegisa.springbootview.condition.ConditionOnSystemProperties;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 2:17 PM
 */
public class SystemPropertiesConditionSpringbootStarter {

    @Bean
    @ConditionOnSystemProperties(name = "aaa",value = "bbb")
    public String helloWorld() {
        return "condition hello";
    }

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SystemPropertiesConditionSpringbootStarter.class);
        ConfigurableApplicationContext context = builder.web(WebApplicationType.NONE).run(args);
        String service = context.getBean("helloWorld", String.class);
        System.out.println(service);
        context.close();
    }
}

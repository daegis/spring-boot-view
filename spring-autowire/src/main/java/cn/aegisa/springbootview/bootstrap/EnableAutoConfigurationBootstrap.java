package cn.aegisa.springbootview.bootstrap;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 6:09 PM
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class);
        builder.web(WebApplicationType.NONE);
        ConfigurableApplicationContext context = builder.run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
        context.close();
    }
}

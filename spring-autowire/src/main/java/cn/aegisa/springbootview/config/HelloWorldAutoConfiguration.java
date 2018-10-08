package cn.aegisa.springbootview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 6:15 PM
 */
@Configuration
public class HelloWorldAutoConfiguration {

    @Bean
    public String helloWorld() {
        return "auto-HelloWorld";
    }

}

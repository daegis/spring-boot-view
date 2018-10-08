package cn.aegisa.springbootview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 2:57 PM
 */
@Configuration
@Profile("default")
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World! 1";
    }
}

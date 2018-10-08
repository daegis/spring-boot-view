package cn.aegisa.springbootview.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 3:04 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
//@Import(HelloConfiguration.class)
@Import({HelloWorldImportSelector.class})
public @interface EnableHelloWorld {

}

package cn.aegisa.springbootview.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 3:40 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnSystemPropertiesCondition.class)
public @interface ConditionOnSystemProperties {
    String name();

    String value();
}

package cn.aegisa.springbootview.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * Using IntelliJ IDEa.
 *
 * @author XIaNYINGDa at 9/28/2018 3:41 PM
 */
public class OnSystemPropertiesCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationattributes = metadata.getAnnotationAttributes(ConditionOnSystemProperties.class.getName());
        Object name = annotationattributes.get("name");
        Object value = annotationattributes.get("value");
        System.out.println(name);
        System.out.println(value);
        return name.equals("aaa") && value.equals("bbb");
    }
}

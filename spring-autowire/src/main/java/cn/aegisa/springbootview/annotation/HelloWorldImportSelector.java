package cn.aegisa.springbootview.annotation;

import cn.aegisa.springbootview.config.HelloConfiguration;
import cn.aegisa.springbootview.config.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Using IntelliJ IDEa.
 * HelloWorld 接口版实现
 *
 * @author XIaNYINGDa at 9/28/2018 2:50 PM
 */
public class HelloWorldImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName(), HelloConfiguration.class.getName()};
    }


}

package com.in28minutes.learnspringframework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * The Spring Gaming configuration class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 2 May 2023 - 15:08:33
 */
@Configuration
@ComponentScan
@Slf4j
public class BeanScopesLauncherApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            if (log.isInfoEnabled()) {
                log.info("Initialization of context is completed");

                System.out.println(context.getBean(NormalClass.class));
                System.out.println(context.getBean(NormalClass.class));

                System.out.println(context.getBean(PrototypeClass.class));
                System.out.println(context.getBean(PrototypeClass.class));
                System.out.println(context.getBean(PrototypeClass.class));
            }
        }
    }

}

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

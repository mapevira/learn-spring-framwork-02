package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * The Spring Gaming configuration class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 2 May 2023 - 15:08:33
 */
@Slf4j
@Configuration
@ComponentScan
public class RealWorldSpringLauncherApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(RealWorldSpringLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            if (log.isInfoEnabled()) {
                log.info(String.valueOf(context.getBean(BusinessCalculationService.class).findMax()));
            }
        }
    }

}

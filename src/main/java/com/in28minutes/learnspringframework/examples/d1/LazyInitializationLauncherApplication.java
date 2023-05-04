package com.in28minutes.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
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
public class LazyInitializationLauncherApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            if (log.isInfoEnabled()) {
                log.info("Initialization of context is completed");

                context.getBean(ClassB.class).doSomething();
            }
        }
    }

}

@Component
class ClassA {
    
}

@Slf4j
@Lazy
@Component
class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {
        super();
        if (log.isInfoEnabled()) {
            log.info("Some Initializer");
        }
        this.classA = classA;
    }
    
    void doSomething() {
        if (log.isInfoEnabled()) {
            log.info("Do something");
        }
    }
}

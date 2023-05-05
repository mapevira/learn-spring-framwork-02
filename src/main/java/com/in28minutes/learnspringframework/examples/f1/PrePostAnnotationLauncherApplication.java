package com.in28minutes.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;
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
public class PrePostAnnotationLauncherApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            if (log.isInfoEnabled()) {
                log.info("Initialization of context is completed");

                System.out.println(context.getBean(BusinessService.class));
            }
        }
    }

}

@Slf4j
@Named
class BusinessService {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Inject
    public void setDataService(DataService dataService) {
        log.info("Setter injection");
        this.dataService = dataService;
    }

}

@Named
record DataService() {
}
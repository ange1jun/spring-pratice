package com.ange1jun.springframework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SpringContextApplicaiton {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (SpringContextApplicaiton.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println("************************************");

            System.out.println("Welcome! This is CalculationService.\n");

            System.out.println("Your Data is = " + context.getBean(BusinessCalculationService.class).findMax());

            System.out.println("\n************************************");
        }
    }
}

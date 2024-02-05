package com.ange1jun.springframework.examples.h1;

import com.ange1jun.springframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class XmlConfigurationContextContextLauncherApplication {

    public static void main(String[] args) {

        String xmlFilePath = "classpath:contextConfiguration.xml";

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlFilePath)) {


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("name: " + context.getBean("name"));

            System.out.println("age: " + context.getBean("age"));

//            System.out.println("gameRunner: " + context.getBean(GameRunner.class).run();

            context.getBean(GameRunner.class).run();

        }
    }
}


package com.ange1jun.springframework.helloworld;

import com.ange1jun.springframework.helloworld.Address;
import com.ange1jun.springframework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            System.out.println(context.getBean("name"));

            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("person2MethodCall"));

            System.out.println(context.getBean("person3Parameters"));

            System.out.println(context.getBean("address2"));

            System.out.println(context.getBean(Address.class));

            System.out.println(context.getBean("person3Qualifier"));
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
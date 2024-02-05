package com.ange1jun.springframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class NormalClass {

}
@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (BeanScopesLauncherApplication.class)) {

        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));


        }
    }
}

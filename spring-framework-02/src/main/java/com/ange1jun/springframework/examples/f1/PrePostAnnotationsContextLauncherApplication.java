package com.ange1jun.springframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.cache.annotation.CachePut;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency= someDependency;
        System.out.println("SomeDependency Initialization compelte....");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Bean is Destoryed !!!");
    }
}



@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Status: is get ready.");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (PrePostAnnotationsContextLauncherApplication.class)) {

        }
    }
}

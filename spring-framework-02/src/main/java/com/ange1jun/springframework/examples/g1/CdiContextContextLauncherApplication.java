package com.ange1jun.springframework.examples.g1;

//import jakarta.inject.Inject;
//import jakarta.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//@Named
class BusinessSerivce {
    private DataService dataService;
//  @Autowired
    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection.");
        this.dataService = dataService;
    }
    public DataService getDataService() {

        return dataService;
    }

}

@Component
//@Named
class DataService {

}


@Configuration
@ComponentScan
public class CdiContextContextLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (CdiContextContextLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessSerivce.class)
                    .getDataService());


        }
    }
}

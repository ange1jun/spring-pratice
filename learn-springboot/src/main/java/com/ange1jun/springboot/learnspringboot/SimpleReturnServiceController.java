package com.ange1jun.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleReturnServiceController {

    @Autowired
    private SimpleReturnService service;
    @RequestMapping("/serivce")
    public SimpleReturnService retrieveAllcourses(){
        return service;
    }
}

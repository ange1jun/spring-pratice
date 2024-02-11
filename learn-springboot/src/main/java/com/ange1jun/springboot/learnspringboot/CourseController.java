package com.ange1jun.springboot.learnspringboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping ("/courses")
//    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1, "AWS", "AmazonWebService"),
                new Course(2, "AKS", "AzureKubernetesService"),
                new Course(3, "GCP", "GoogleCloudPlatform"),
                new Course(4, "Azure", "Microsoft"),
                new Course(3, "AzurePipeline", "Management Pipeline")
        );
    }
}

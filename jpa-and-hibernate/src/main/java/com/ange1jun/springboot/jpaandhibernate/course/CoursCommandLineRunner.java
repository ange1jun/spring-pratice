package com.ange1jun.springboot.jpaandhibernate.course;

import com.ange1jun.springboot.jpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoursCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "AWS for JPA", "ange1jun"));
        repository.save(new Course(2, "AKS for JPA", "ange1jun"));
        repository.save(new Course(3, "GKS for JPA", "ange1jun"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("ange1jun"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("AKS for JPA"));
        System.out.println(repository.findByName("GKS for JPA"));

    }
}

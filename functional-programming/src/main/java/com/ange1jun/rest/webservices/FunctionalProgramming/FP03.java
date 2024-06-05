package com.ange1jun.rest.webservices.FunctionalProgramming;

import java.util.List;

public class FP03 {
    public static void main(String[] args) {

        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> numbers =
                List.of(1, 2, 5, 10, 32, 84, 234, 1234, 3245, 4346);

        oddNumbers(numbers);
        allCourse(courses);
        courseSpring(courses);
        courseLongName(courses);
    }

    private static void oddNumbers(List<Integer> numbers) {
        System.out.println("odd Number ->");
        numbers.stream()
                .filter(number->number%2 != 0)
                .forEach(System.out::println);
    }

    private static void allCourse(List<String> courses) {
        System.out.println();
        courses.stream()
                .forEach(System.out::println);
    }

    private static void courseSpring(List<String> courses){
        System.out.println();
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void courseLongName(List<String> courses){
        System.out.println();
        courses.stream()
                .filter(course -> course.length() > 5)
                .forEach(System.out::println);
    }
}


package com.ange1jun.rest.webservices.FunctionalProgramming;

import java.util.List;

public class FP04 {
    public static void main(String[] args) {

        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservice", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5, 6);

        printAllNumberListFunctional(numbers);
        printEvenNumberListFunctional(numbers);
        printSqureEvenNumberListFunctional(numbers);
        printCubeOddNumberListFunctional(numbers);
        numOfCharacterCourse(courses);
    }
    private static void printAllNumberListFunctional(List<Integer> numbers) {
        System.out.println("All Num ->");
        numbers.stream()
                .forEach(System.out::println);
        System.out.println();
    }
    private static void printEvenNumberListFunctional(List<Integer> numbers) {
        System.out.println("Even Num ->");
        numbers.stream()
                .filter(number -> (number%2) == 0)
                .forEach(System.out::println);
        System.out.println();
    }
    private static void printSqureEvenNumberListFunctional(List<Integer> numbers) {
        System.out.println("SqureEvenNum ->");
        numbers.stream()
                .filter(number -> (number%2) == 0)
                .map(number-> number*number)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printCubeOddNumberListFunctional(List<Integer> numbers) {
        System.out.println("SqureEvenNum ->");
        numbers.stream()
                .filter(number -> (number%2) != 0)
                .map(number -> number*number*number)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void numOfCharacterCourse(List<String> courses){
        System.out.println("lengthCourse ->");
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }
}

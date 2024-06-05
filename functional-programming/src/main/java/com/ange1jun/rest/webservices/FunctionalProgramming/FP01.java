package com.ange1jun.rest.webservices.FunctionalProgramming;

import java.util.List;

public class FP01 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 12, 13, 14, 15, 16);
//        printAllNumberListFunctional(numbers);
        printEvenNumberListFunctional(numbers);
    }

    private static void printAllNumberListFunctional(List<Integer> numbers) {
        System.out.println("ALL NUMBER ->");
        numbers.stream()
                .forEach(System.out::println);
    }

    private static void printEvenNumberListFunctional(List<Integer> numbers) {
        System.out.println("EVEN NUMBER ->");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}

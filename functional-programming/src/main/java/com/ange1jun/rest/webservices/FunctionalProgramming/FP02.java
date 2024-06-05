package com.ange1jun.rest.webservices.FunctionalProgramming;

import java.util.List;

public class FP02 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 12, 13, 14, 15, 16);
//        printAllNumberListFunctional(numbers);
        printEvenNumberListFunctional(numbers);
    }

    private static boolean isEven(int number){
        return number%2 == 0;
    }
    private static void printAllNumberListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::print);
    }


    private static void printEvenNumberListFunctional(List<Integer> numbers) {
        numbers.stream()
//                .filter(FP02::isEven)
                .filter(number->number%2==0)
                .forEach(System.out::print);

    }
}

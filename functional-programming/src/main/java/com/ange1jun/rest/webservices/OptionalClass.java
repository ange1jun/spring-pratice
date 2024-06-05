package com.ange1jun.rest.webservices;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "mango", "cherry");

        Predicate<? super String> predicate = fruit -> fruit.startsWith("x");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();

        // Optional을 안전하게 사용
        System.out.println("Optional: " + optional);
        System.out.println("Is empty: " + optional.isEmpty());
        System.out.println("Is present: " + optional.isPresent());

        // 값이 존재할 때만 get() 호출
        optional.ifPresent(value -> System.out.println("Value: " + value));

        // 기본 값을 제공하여 안전하게 값을 가져오기
        String defaultValue = optional.orElse("No fruit found");
        System.out.println("Value or default: " + defaultValue);

        // 값이 존재할 경우 예외를 던지는 get() 사용 예제 (비추천)
        try {
            System.out.println("Value using get(): " + optional.get());
        } catch (NoSuchElementException e) {
            System.out.println("No value present in optional");
        }

        // Optional 객체 생성 예제
        Optional<String> optionalS = Optional.of("xmango");
        System.out.println("Optional of: " + optionalS);

        Optional<String> empty = Optional.empty();
        System.out.println("Empty optional: " + empty);
    }
}

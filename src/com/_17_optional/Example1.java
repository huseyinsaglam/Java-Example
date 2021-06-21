package com._17_optional;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {

        System.out.println("============= Example-1 ==========");
        Integer numara = 0;

        Optional<Integer> opt = Optional.ofNullable(numara);

        opt
                .map(num->Math.pow(num,2))
                .ifPresent(System.out::println);

        System.out.println("============= Example-2 ==========");
        List<String> message =Arrays.asList("ali","ahmet","mehmet","huseyin");
        Optional<List<String>> opt2 = Optional.ofNullable(message);

        opt2.ifPresent(m -> m.stream().filter(p->p.length()>5).forEach(System.out::println));

        System.out.println("============= Example-3 ==========");
        Integer numara2 = 8;
        Optional<Integer> opt3= Optional.ofNullable(numara2);
        int result = opt3.orElse(5);
        System.out.println(result);

        System.out.println("============= Example-4 ==========");


    }
}

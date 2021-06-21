package com._12_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Fenerbahce","Besiktas","Galatasaray","Basaksehir","Hatayspor");

        System.out.println(" ============ Example-1 ===========");
        names.stream().filter(str -> str.length() > 6).forEach(System.out::println);

        System.out.println(" ============ Example-2 ===========");
        names.stream().filter(str -> str.length() > 6).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(" ============ Example-3 ===========");
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = num.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

    }
}

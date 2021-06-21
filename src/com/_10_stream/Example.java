package com._10_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {

        System.out.println("========== Example-1 ===========");
        Stream.iterate(1, i ->i+1).filter(i -> i%2 ==0 ).limit(10).forEach(System.out::println);

        System.out.println("========== Example-2 ===========");
        //list 1
        List<String> list1 = Arrays.asList("Fenerbahce","Hatayspor","Besiktas");
        //list 2
        List<String> list2 = Arrays.asList("Huseyin","Ali","Ahmet");

        Stream.concat(list1.stream(),list2.stream()).forEach(list -> System.out.println(list));

    }
}

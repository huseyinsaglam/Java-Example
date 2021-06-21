package com._07_stream_takeWhile;

import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

        Stream<String> exmp = Stream.of("adana","ankara","istanbul","izmir");
        exmp.takeWhile(i -> i.length()%2 !=0).forEach(System.out::println);

    }
}

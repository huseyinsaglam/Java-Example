package com._18_lambdaExamples;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> consumer = p -> {
            System.out.println(p);
        };
        String word = "Hello word";
        consumer.accept(word);
    }
}

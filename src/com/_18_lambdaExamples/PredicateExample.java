package com._18_lambdaExamples;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        String emp ="deneme";
        Predicate<String> word = p -> p.equals("deneme");
        System.out.println(word.test(emp));


    }
}

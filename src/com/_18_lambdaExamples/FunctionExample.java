package com._18_lambdaExamples;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Double> emp = p -> Math.pow(p,2);
        Double emp2 = emp.apply(5);
        System.out.println(emp2);
    }
}

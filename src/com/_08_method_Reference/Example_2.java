package com._08_method_Reference;

import java.util.function.BiFunction;

@FunctionalInterface
interface Calculater1 {
    public int carpmaMessage1(int a, int b);
}

class Calculater {
    public static int carpma(int a, int b) {
        return a * b;
    }
}

public class Example_2 {

    public static void main(String[] args) {
        Calculater1 a  = Calculater::carpma;
        System.out.println(a.carpmaMessage1(5,5));

        BiFunction<Integer,Integer, Integer> b = Calculater::carpma;
        System.out.println(b.apply(6,6));
    }
}

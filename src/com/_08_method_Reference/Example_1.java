package com._08_method_Reference;

@FunctionalInterface
interface Deneme1 {
    public String denemeMessage1();
}

interface Deneme2 {
    public String denemeMessage2();
}

public class Example_1 {

    public String message() {
        return "hello word";
    }

    public static void main(String[] args) {
        Example_1 example1 = new Example_1();
        Deneme1 deneme1 = example1::message;
        System.out.println("Deneme1 = " + deneme1.denemeMessage1());

        Deneme2 deneme2 = example1::message;
        System.out.println("Deneme2 = " + deneme2.denemeMessage2());
    }
}

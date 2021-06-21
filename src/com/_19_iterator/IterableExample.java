package com._19_iterator;

import java.util.Collection;

public class IterableExample {
    public static void main(String[] args) {

       Collection<String> collection = CollectionUtil.getNumbers();

       iterable(collection);
    }

    private static void iterable(Iterable<String> iterable) {
        iterable.forEach( it -> {
            System.out.println("it elamanı = " + it.toString() + "it elamanı uzunlugu = " + it.length());
        });
    }
}

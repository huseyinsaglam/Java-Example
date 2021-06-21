package com._19_iterator;

import java.util.HashSet;
import java.util.Set;

public class CollectionUtil {

    private static Set<String> numbers;

    static {
        numbers = new HashSet<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
    }

    public static void setNumbers(Set<String> numbers) {
        CollectionUtil.numbers = numbers;
    }

    public static Set<String> getNumbers() {
        return numbers;
    }
}

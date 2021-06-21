package com._13_stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        System.out.println(" ============ Example-1 ===========");
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "Apple");
        hmap.put(22, "Orange");
        hmap.put(33, "Kiwi");
        hmap.put(44, "Banana");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> map.getKey() <= 22)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);

        System.out.println(" ============ Example-2 ===========");

        Map<Integer, String> hmap2 = new HashMap<Integer, String>();
        hmap2.put(11, "Apple");
        hmap2.put(22, "Orange");
        hmap2.put(33, "Kiwi");
        hmap2.put(44, "Banana");

        Map<Integer, String> result2 = hmap2.entrySet()
                .stream()
                .filter(map -> "Orange".equals(map.getValue()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result2);
    }
}

package com._15_groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        List<String> team = Arrays.asList("Fenerbahce","Galatasaray","Besiktas","Hatayspor","Basaksehir","Bursaspor", "Balıkkesirspor");

        Map<String, Long> teamGroup = team.stream().filter( i -> i.startsWith("B"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(teamGroup);

    }
}

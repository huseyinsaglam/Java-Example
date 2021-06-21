package com._05_mapExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ali","Ahmet","Vatan");

        getNames(names);
    }

    private static void getNames(List<String> names) {
        List<String> aaa = new ArrayList<>();
        boolean bbb = aaa.addAll(names);

        System.out.println(bbb);
    }
}

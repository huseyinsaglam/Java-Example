package com._08_method_Reference;

import java.util.Arrays;

public class Example_3 {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[]{ "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};

        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String str: stringArray){
            System.out.println(str);
        }
    }
}

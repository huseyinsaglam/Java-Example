package com._23_map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {

        // cok boyutlu dizi
        // https://medium.com/@beginnertoadvanced24/ikijava-i%CC%87ki-boyutlu-diziler-3f83cfdc15e4

        String [] [] teamFutbol = MapUtils.team;
        Map<String,String> map = new HashMap<>();

        for (int i=0; i< teamFutbol.length; i++)
        {
          //  System.out.println(teamFutbol[i]);
            String[] pair = teamFutbol[i];
            Object x = pair[0];
            Object y = pair[1];
            map.put((String) x, (String) y);
        }

        System.out.println("Map degiskeni = " + map.entrySet());

    }
}

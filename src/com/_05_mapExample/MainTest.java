package com._05_mapExample;

import java.util.HashMap;
import java.util.Map;

public class MainTest {

    public static void main(String[] args) {

        String ad = "Ali";

        Isım isim = new Isım();

        Map<String,String> name = new HashMap<>();
        name.put("E12","Ali");
        name.put("Veli","E13");
        name.put("Ahmet","E14");
        name.put("Huseyin","E15");

        /*System.out.println(name.get("Ali"));*/
       // System.out.println(isim.getName());

      /*  if(isim.getName().equals(name.get("E12"))) {
            System.out.println("Ali nesne dogrudur.");
        }*/
        if(isim.getName().equals("E13")) {
            System.out.println("Veli nesne dogrudur.");
        }
        else {
            System.out.println("Ali nesne yanlıştır.");
        }
    }
}

package com._23_map;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {


            Map<String, Integer> map = new HashMap<>();
            map.put("one",1);
            map.put("two",2);
            map.put("ten",10);
            map.put("eleven",11);
            map.put("fifty",50);

            Set set = map.entrySet();
            set.forEach(System.out::println);

            Set set1 = map.keySet();
            set1.forEach(System.out::println);

           Collection coll =  map.values();
           coll.forEach(System.out::println);

           Set set2 = map.keySet();
           Iterator it = set2.iterator();

           while (it.hasNext()) {
              Object o =  it.next();
              Object v = map.get(o);
              System.out.println("Key = " + o + "->" + "value =" + v);
           }

    }
}

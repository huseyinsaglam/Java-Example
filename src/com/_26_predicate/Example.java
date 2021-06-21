package com._26_predicate;

import java.util.*;
import java.util.function.Predicate;

public class Example<iteratorThanRemove> {

    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Michael");
        names.add("Sam");
        names.add("Ed");
        names.add("Alexander");

        Predicate<String> opr = s -> s.length() > 5;
        names.removeIf(opr);
        System.out.println(names);

     //   iteratorThanRemove(names);


    }

    public static void iteratorThanRemove(Collection<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext())
        {
            Object i = it.next();
            String o = (String) i;
            if (o.length()>5) {
                it.remove();
            }

        }
        System.out.println(list);
    }

}

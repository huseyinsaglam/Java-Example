package com._19_iterator;

import java.util.Collection;
import java.util.Iterator;

public class Example1 {

    public static void main(String[] args) {

        Collection collection = CollectionUtil.getNumbers();

        System.out.println("iterator den once = " +collection);

        Iterator<String> cmp = collection.iterator();

        while (cmp.hasNext())
        {
           Object o =  cmp.next();
           System.out.println("cmp-next = " + o);
           String s =  (String) o ;
           if (s.startsWith("T")) {
               cmp.remove();
           }
        }

/*        for (Object i : collection)
        {
            System.out.println("iterator den sonra = " +i.toString());
        }*/

        System.out.println("iterator den sonra = " +collection);


    }
}

package com._22_set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        for (int i=0;i<args.length;i++)
        {
            if (!set1.add(args[i]))
            {
                System.out.println("duplicated deger " + args[i]);
            }
        }
    }
}

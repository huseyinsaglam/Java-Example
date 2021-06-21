package com._21_comparator.Object;

import java.util.Comparator;

public class ObjectComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Person e2 = (Person) o2;

        if(e1.getAge()>e2.getYas())
            return -1;
        else if(e1.getAge()<e2.getYas())
            return 1;
        else return 0;
    }
}

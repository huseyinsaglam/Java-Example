package com._21_comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator {

    public String message(){
        return "hello";
    }


    @Override
    public int compare(Object o1, Object o2) {
        Employee a1 = (Employee) o1;
        Employee a2 = (Employee) o2;

        if (a1.getAge()<a2.getAge()) {
            return -1;
        }
        else if (a1.getAge()>a2.getAge()) {
            return 1;
        }
        else return 0;
    }
}

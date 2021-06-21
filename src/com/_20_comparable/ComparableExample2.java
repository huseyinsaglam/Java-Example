package com._20_comparable;

import java.util.*;

public class ComparableExample2 {
    public static void main(String[] args) {

        Employee e1 = new Employee(10, "testname1", "testsurname1");
        Employee e2 = new Employee(20, "testname2", "testsurname2");

        System.out.println(e1.compareTo(e2));


        List<Employee> empset = new ArrayList<>();
        empset.add(e1);
        empset.add(e2);

        Collections.sort(empset);

        System.out.println(empset);

    }
}

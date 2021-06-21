package com._21_comparator.Object;

import java.util.Comparator;

public class ComparotorExample2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(10, "testname2", "testsurname2");
        Person p1 = new Person(20, "testname1", "testsurname1");

        Comparator ec = new ObjectComparator();
        System.out.println(ec.compare(e1,p1));
    }
}

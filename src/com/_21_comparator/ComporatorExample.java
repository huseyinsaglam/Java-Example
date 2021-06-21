package com._21_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComporatorExample {

    public static void main(String[] args) {

        Employee e1 = new Employee(10, "testname2", "testsurname2");
        Employee e2 = new Employee(20, "testname1", "testsurname1");

        Comparator<Employee> ec = new  EmployeeComparator();
        System.out.println(ec.compare(e1,e2));

        EmployeeComparator ec2 = new  EmployeeComparator();
        System.out.println(ec2.message());


        List<Employee> empset = new ArrayList<>();
        empset.add(e1);
        empset.add(e2);

        Comparator<Employee> ec3 = (x1,x2) -> x1.getName().compareTo(x2.getName());
       // Comparator<Employee> ec4 = (x1,x2) -> x2.getName().compareTo(x1.getName());
        Collections.sort(empset,ec3);
        System.out.println(empset);

    }
}

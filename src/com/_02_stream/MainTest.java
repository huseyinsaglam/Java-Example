package com._02_stream;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        List<Employee>  employeeList = Arrays.asList(new Employee("huseyin",20,"10000"),
                new Employee("ali",21,"20000"),
                new Employee("veli",22,"30000"),
                new Employee("huseyin",23,"15000"),
                new Employee("huseyin",24,"25000"));




        Employee emp = employeeList.stream().filter(item -> "huseyin".equals(item.getName())).findFirst().orElse(null);
        System.out.println(emp.toString());


        Employee emp1 = employeeList.stream().filter(item -> "huseyin".equals(item.getName())).findAny().orElse(null);
        System.out.println(emp1.toString());

        Employee emp3 = employeeList.stream().parallel().filter(item -> "huseyin".equals(item.getName())).findAny().orElse(null);
        System.out.println(emp3.toString());

    }
}

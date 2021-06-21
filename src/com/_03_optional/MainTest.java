package com._03_optional;

import com._02_stream.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainTest {
    public static void main(String[] args) {

        System.out.println("============= örnek 1 =====================");
        Optional<Double> number = Optional.ofNullable(3.0);
        number.ifPresent(num -> {
            System.out.println(Math.pow(num,2));
        });

        System.out.println("============= örnek 2 =====================");
        List<Employee> employeeList = Arrays.asList(new Employee("huseyin",20,"10000"),
                new Employee("ali",21,"20000"),
                new Employee("veli",22,"30000"),
                new Employee("huseyin",23,"15000"),
                new Employee("huseyin",24,"25000"));

        Optional<List<Employee>> emp = Optional.ofNullable(employeeList);

        emp.ifPresent(item ->
                item.stream().filter(i->"huseyin".equals(i.getName())).forEach(System.out::println));

    }
}

package com._01_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_1 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("mkyong", 30, "10000"),
                new Employee("jack", 27, "20000"),
                new Employee("lawrence", 33, "30000")
        );

        List<String> empList = employees.stream().map(item ->
           item.getName()
        ).collect(Collectors.toList());

       // System.out.println(empList);

        convertToStaffPublic();

    }

    private static List<EmployeeConvert> convertToStaffPublic() {

        List<Employee> employees = Arrays.asList(
                new Employee("mkyong", 30, "10000"),
                new Employee("jack", 27, "20000"),
                new Employee("lawrence", 33, "30000")
        );

        List<EmployeeConvert> list1 =
                employees
                .stream()
                .map(item -> {
                    EmployeeConvert employeeConvert = new EmployeeConvert();
                    employeeConvert.setConvertName(item.getName());
                    employeeConvert.setConvertExtra(item.getSalary());
                    return employeeConvert;
                }).collect(Collectors.toList());

        System.out.println(list1);
        return list1;
    }
}

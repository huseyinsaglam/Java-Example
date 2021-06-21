package com._27_cokcesitlilik.best;

public class PayrollOffice {

    public void paySalary(Employee employee) {

        double salary = employee.calculateSalary();
        System.out.println("Paying a salary of " + salary + " to " + employee.getName());
    }
}

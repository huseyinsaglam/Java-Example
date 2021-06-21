package com._28_cokcesitlilik.force;

public class Employee {
    private int no;
    private String name;
    private int year;
    private String department;
    private String departmentManaged; // For Managers
    private double bonus; // For Directors

    private int type;

    public static final int BASE_SALARY = 500;
    public static final int MANAGEMENT_PAYMENT = 3000;

    // For Employee
    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
        type = 0;
    }

    // For Manager;
    public Employee(int no, String name, int year, String department, String departmentManaged) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
        this.departmentManaged = departmentManaged;
        type = 1;
    }

    // For Director
    public Employee(int no, String name, int year, String department, String departmentManaged, double bonus) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
        this.departmentManaged = departmentManaged;
        this.bonus = bonus;
        type = 2;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + "]";
    }
}

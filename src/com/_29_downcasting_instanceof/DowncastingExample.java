package com._29_downcasting_instanceof;

import com._27_cokcesitlilik.best.Director;
import com._27_cokcesitlilik.best.Employee;
import com._27_cokcesitlilik.best.Manager;

public class DowncastingExample {

    public static void main(String[] args) {
        // Upcasting
        Employee e1 = new Employee(5, "İsmail", 14, "Production");
        e1 = new Manager(5, "İsmail", 14, "Production", "Production");

        Employee e2 = new Employee(1, "Ali", 4, "Production");
        // Downcasting
//		Manager m2 = (Manager) e2; // ClassCastException!
//		m2.manage();

//		Director d1 = (Director) new Manager(5, "İsmail", 14, "Production", "Production"); // ClassCastException!
//		Director d2 = (Director) new Employee(1, "Ali", 4, "Production"); // ClassCastException!


        if (e2 instanceof Director) {
            Director d3 = (Director) e2;
            d3.makeAStrategicPlan();
        } else if (e2 instanceof Manager) {
            Manager m = (Manager) e2;
            m.manage();
        }else
            e2.work();

    }
}

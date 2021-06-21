package com._31_arayuzYenilikleri.driver;

import com._31_arayuzYenilikleri.vehicle.Floatable;

public class Harbour {
    protected String name;

    public Harbour(String name) {
        this.name = name;
    }

    public void enter(Floatable floatable){
        System.out.println("\n" + floatable + " has entered the harbour: " + name);
        floatable.floatNow();
        floatable.park();
    }

    @Override
    public String toString() {
        return "Harbour [name=" + name + "]";
    }
}

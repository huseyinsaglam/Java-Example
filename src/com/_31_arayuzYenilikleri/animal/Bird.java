package com._31_arayuzYenilikleri.animal;


import com._31_arayuzYenilikleri.vehicle.Flyer;

public class Bird extends Animal implements Flyer {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird is taking off.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing.");
    }

}

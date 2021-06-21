package com._31_arayuzYenilikleri.driver;

public abstract class AbstractDriver implements Driver{

    protected String name;

    public AbstractDriver(String name) {
        this.name = name;
    }
}

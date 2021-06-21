package com._35_ornek;

public class Person {
    private Long id;
    private String value;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}

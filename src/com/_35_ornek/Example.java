package com._35_ornek;

public class Example {

    public static void main(String[] args) {
        PersonUtil personUtil = new PersonUtil();
        System.out.println(personUtil.getAllProducts());
        System.out.println(personUtil.searchRezervModemDegisimi(Long.valueOf(98222)));

        for (Person item : personUtil.getAllProducts()) {
            if(personUtil.searchRezervModemDegisimi(item.getId()))
            {
                System.out.println(item.getId());
                System.out.println("Dogru");
            }
        }


    }
}

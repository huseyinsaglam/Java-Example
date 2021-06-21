package com._35_ornek;

import java.util.ArrayList;
import java.util.List;

public class PersonUtil {
    private List<Person> listOfPerson = new ArrayList<Person>();

    public PersonUtil() {
        Person person1 = new Person();
        person1.setId(15L);

        Person person2 = new Person();
        person2.setId(20L);


        Person person3 = new Person();
        person3.setId(30L);


        Person person4 = new Person();
        person4.setId(40L);

        Person person5 = new Person();
        person5.setId(98222L);

        listOfPerson.add(person1);
        listOfPerson.add(person2);
        listOfPerson.add(person3);
        listOfPerson.add(person4);
        listOfPerson.add(person5);
    }

    public List<Person> getAllProducts() {

        return listOfPerson;
    }

    public boolean searchRezervModemDegisimi(Long itemId) {
        Long rezervModemDegisim = Long.valueOf(98222);
        for (Person item : getAllProducts()) {
            if(item.getId().equals(rezervModemDegisim)) {
                if (item.getId().equals(itemId)) {
                    return true;
                }
            }
        }
        return false;
    }
}

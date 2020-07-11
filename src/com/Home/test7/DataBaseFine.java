package com.Home.test7;

import java.util.*;

public class DataBaseFine {
    private Person person;
    private ArrayList<Person> persons = new ArrayList<>();

    public DataBaseFine() {
        person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    //превоначальная база штрафов(мар с кодом человека и набором его штрафов, дата базе сязываеться с первоначальными персами)
    public void defaultDataBaseFine() {
        Fine fine0 = new Fine();
        fine0.creatureElementMapFines("Fine 1", 10);
        fine0.creatureElementMapFines("Fine 2", 20);
        fine0.creatureElementMapFines("Fine 3", 30);
        persons.add(new Person(001, "Kiev", fine0));

        Fine fine1 = new Fine();
        fine1.creatureElementMapFines("Fine 1", 10);
        fine1.creatureElementMapFines("Fine 4", 40);
        fine1.creatureElementMapFines("Fine 5", 50);
        fine1.creatureElementMapFines("Fine 6", 60);
        persons.add(new Person(002, "Odessa", fine1));

        Fine fine2 = new Fine();
        fine2.creatureElementMapFines("Fine 2", 20);
        fine2.creatureElementMapFines("Fine 7", 70);
        persons.add(new Person(003, "Lviv", fine2));

        Fine fine3 = new Fine();
        fine3.creatureElementMapFines("Fine 8", 80);
        persons.add(new Person(004, "Lviv", fine3));

        Fine fine4 = new Fine();
        fine4.creatureElementMapFines("Fine 1", 10);
        persons.add(new Person(005, "Dnepr", fine4));

        //person.compareTo(person);
//        List<String> subList = persons.subList(0,persons.size());
//        Collections.sort(subList);

    }


    @Override
    public String toString() {
        return "DataBaseFine{" +
                "persons=" + "\n" + persons +
                '}';
    }

}

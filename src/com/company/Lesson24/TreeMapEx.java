package com.company.Lesson24;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class AnimalImplComp implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class Animal {
    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class TreeMapEx {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("C", 3);
//        map.put("D", 2);
//        map.put("A", 1);
//        map.put("B", 4);
//
//        for (String s : map.keySet()) {
//            System.out.print(s.hashCode() + " ");
//            System.out.println(s);
//        }


        Comparator<Animal> animalComparator = new AnimalImplComp();
        Map<Animal, Integer> map = new TreeMap<>(animalComparator);
        //Map<Animal, Integer> map = new TreeMap<>(Comparator.comparing(Animal::getName));
        map.put(new Animal("Zuberg", 8), 4000);
        map.put(new Animal("Abcd", 12), 8000);
        map.put(new Animal("Fluffy", 6), 1000);
        map.put(new Animal("Alex", 10), 2000);


        for (Map.Entry<Animal, Integer> animal : map.entrySet()) {
            System.out.println(animal.getKey() + " " + animal.getValue());
        }


    }
}

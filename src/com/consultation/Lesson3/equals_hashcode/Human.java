package com.consultation.Lesson3.equals_hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {
    String name;
    int age;
    String numPass;

    public Human() {
    }

    public Human(String name, int age, String numPass) {
        this.name = name;
        this.age = age;
        this.numPass = numPass;
    }

    @Override
    public boolean equals(Object o) {
//      Human human1 = new Human();
//      Human human2 = human1;
        if (this == o) return true;
        if (o.getClass() != Human.class) return false;
        Human human = (Human) o;
        return numPass.equals(human.numPass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPass);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numPass='" + numPass + '\'' +
                '}';
    }
}


class Test {
    public static void main(String[] args) {
        Map<Human, String> map = new HashMap<>();
        map.put(new Human("Ivan1", 12, "CB1"), "One");
        map.put(new Human("Ivan1", 12, "CB2"), "Two");
        map.put(new Human("Ivan1", 12, "CB3"), "Three");
        map.put(new Human("Ivan1", 12, "CB4"), "Four");

        for (Map.Entry<Human, String> entry : map.entrySet()) {
            System.out.println(entry.getKey().numPass.hashCode() + " " + entry.getKey() + " " + entry.getValue());
        }

        String str1 = "Hello";
        String str2 = "Hello";
        Integer i = 12;
        Integer a = 12;

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(i.hashCode());
        System.out.println(a.hashCode());

        Map<String, String> map1 = new HashMap<>();
        map1.put("A", "1");
        map1.put("B", "2");
        map1.put("C", "3");
        map1.put("D", "4");
        map1.put("E", "5");
        for (Map.Entry<String, String> entry: map1.entrySet()) {
            System.out.println(entry.getKey() +" " + entry.getValue());

        }






    }
}
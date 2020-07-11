package com.company.Lesson23;

import java.util.*;

class Human {
    String name;
    int INN;


    public Human(String name, int age) {
        this.name = name;
        this.INN = age;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != Human.class) {//this.getClass()
            return false;
        }
        Human human = (Human) o;
        return INN == human.INN && name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, INN);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", INN=" + INN +
                '}';
    }
}


public class MapEx {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Hello", 21);
//        map.put("Evgen", 25);
//        map.put("Evgen", 23);

        Map<Human, Integer> humanMap = new HashMap<>();
        humanMap.put(new Human("Evgen", 18), 21);
        humanMap.put(new Human("Evgen", 18), 67);

//        for (Human human : humanMap.keySet()) {
//            System.out.println(human.hashCode());
//            System.out.println(human);
//        }
//        for (Integer value : humanMap.values()) {
//            System.out.println(value);
//        }
        for (Map.Entry<Human, Integer> humanEntry : humanMap.entrySet()) {
            System.out.println(humanEntry.getKey() + " " + humanEntry.getValue());
        }
        System.out.println();

        Iterator<Map.Entry<Human, Integer>> iterator = humanMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

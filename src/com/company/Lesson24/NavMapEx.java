package com.company.Lesson24;

import java.util.*;

class CarColorSort implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.color.compareTo(o2.color);
    }
}


class Car {

    String color;
    Integer number;

    public Car(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}

public class NavMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> navigableMap = new TreeMap<>();
        navigableMap.put("Александр", 10);
        navigableMap.put("Алексей", 12);
        navigableMap.put("Борис", 11);
        navigableMap.put("Василий", 12);
        navigableMap.put("Григорий", 9);
        navigableMap.put("Даниил", 12);
        //Map.Entry<String, Integer> boris = navigableMap.ceilingEntry("Борис");
        //Map.Entry<String, Integer> boris = navigableMap.floorEntry("Борис");
        //Map.Entry<String, Integer> boris = navigableMap.firstEntry();
        //Map.Entry<String, Integer> boris = navigableMap.lastEntry();
        SortedMap<String, Integer> sortedMap = navigableMap.subMap("Алексей", "Григорий");
        for (String s : sortedMap.keySet()) {
            System.out.println(s);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(34);
        arrayList.add(41);
        arrayList.add(2);
        arrayList.add(31);
        arrayList.add(21);

/*        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });// 1 вариант*/
        //arrayList.sort((o1, o2) -> o1.compareTo(o2));// 2 вариант
        arrayList.sort(Integer::compareTo);// 3 вариант
        for (Integer integer : arrayList) {
            System.out.println("integer = " + integer);
        }

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("red", 123));
        carList.add(new Car("green", 123));
        carList.add(new Car("blue", 123));
        carList.add(new Car("yellow", 123));

        Comparator<Car> carSort = new CarColorSort();
        carList.sort(carSort);

        for (Car car : carList) {
            System.out.println(car + " ");
        }


    }
}

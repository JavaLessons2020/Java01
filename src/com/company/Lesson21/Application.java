package com.company.Lesson21;

import java.util.*;

public class Application {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer a = 99;
        arrayList.add(99);
        arrayList.add(99);
        arrayList.add(null);
        arrayList.add(99);
        arrayList.add(99);
        System.out.println(arrayList.size() + " " + arrayList.get(1));
        arrayList.remove(a);
        arrayList.remove(2);
        System.out.println(arrayList.size() + " " + arrayList.get(1));
        System.out.println("=============");

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }


        //вывод списка на консоль
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }


        //приводим список к массиву
        Integer[] arr = new Integer[10];
        arr = arrayList.toArray(arr);


        System.out.println("массив" + Arrays.toString(arr));

        //массив приводим к списку
        ArrayList<Integer> newArr = new ArrayList<>(Arrays.asList(arr));
        newArr.add(109);
        for (Integer integer : newArr) {
            System.out.print(integer + " ");
        }


        System.out.println();
        newArr.add(6, 111);
        for (Integer integer : newArr) {
            System.out.print(integer + " ");
        }

        newArr.set(1, 22);
        System.out.println();

        for (Integer integer : newArr) {
            System.out.print(integer + " ");
        }
    }
}

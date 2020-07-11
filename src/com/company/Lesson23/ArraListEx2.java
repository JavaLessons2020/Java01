package com.company.Lesson23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraListEx2 {
    public static void main(String[] args) {
        Integer arr[] = new Integer[100];
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));//10   (10*3)/2+1

        //arrayList.add(12);

        System.out.println("size 1 = " + arrayList.size());
        for (Integer i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, i + 1);

        }
//        System.out.println("size 2 = " + arrayList.size());
//        for (Integer i = 99; i <= 0; i--) {
//            arrayList.remove(i);
//        }
//
//
//        System.out.println("size 3 = " + arrayList.size());
//        for (Integer integer : arrayList) {
//            System.out.println(integer);
//        }
        arrayList.trimToSize();
    }
}

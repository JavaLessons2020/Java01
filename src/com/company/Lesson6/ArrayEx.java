package com.company.Lesson6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {

//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int c1 = 0;
//        int c2 = 0;
//        int c3 = 0;
//        int c4 = 0;
        int arr[] = new int[7];

//        System.out.println(arr[0]);
//        System.out.println(arr[6]);

        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
        }
        //             0   1   2   3
        int arr1[] = {12, 56, 34, 99};
        //System.out.println(arr1[4]);//выход за пределы массива

        System.out.println("Длина моего массива = " + arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Элемент с индексом " + i + " = " + arr1[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива");
        int x = scanner.nextInt();

        int[] arrX = new int[x];

//        for (int i = 0; i < arrX.length; i++) { // заполнение массива через сканер
//            System.out.println("Вводите данные");
//            arrX[i] = scanner.nextInt();
//        }
        for (int i = 0; i < arrX.length; i++) {        //заполнение массива рандомными значениями
            arrX[i] = (int) (10 + (Math.random() * 100));
        }
//        for (int i = 0; i < arrX.length; i++) { //обычный вывод эл-тов массива
//            System.out.println(arrX[i]);
//        }
        //foreach
        for (int item : arrX) { // item - сразу хранит значения эл-ов массива
            System.out.println(item);
        }

        String strArr[] = new String[5];
        String s = strArr[0];
        System.out.println(s);

        char max, min;
        char[] ch = {75, 'E', 'L', 'L', 'O'};
        min = max = ch[0];
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] > max) {
                max = ch[i];
            }
            if (ch[i] < min) {
                min = ch[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


        int[] a = {19, 32, 13, 45, 61, 25};

        int a1[] = new int[3];

//        for (int i = 0; i < a.length; i++) {
//            if (i < 3) {
//                a1[i] = a[i];
//            }
//        }
//
//        for (int i : a1) {
//            System.out.print(i);
//        }

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(a, 1, a.length - 2);
        for (int i : a) {
            System.out.print(i + " ");
        }

        a1 = Arrays.copyOf(a,3);
        int[] ints = Arrays.copyOfRange(a, 3, a.length - 1);

        System.out.println();
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(ints));
        int i = Arrays.binarySearch(a, 61);
        System.out.println(i);

        int i1 = a[a.length-1];

    }


}

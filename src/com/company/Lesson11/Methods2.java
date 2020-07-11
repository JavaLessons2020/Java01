package com.company.Lesson11;

import java.util.Arrays;

public class Methods2 {

    public static void test(int a, int b){//test(int a, int b) - сигнатура метода
        System.out.println();
        //return; //выполнение выхода из метода
    }

    public static int test(int a){
        System.out.println();
        return  10;
    }

    public static void test(double a, double b){
        System.out.println();
    }


//    public static void test(int[]arr){
//        for (int i = 0; i < arr.length; i++) {
//            int rand = (int) (Math.random() * 10);
//            arr[i] = rand;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static void test(double test, int...arr){
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 10);
            arr[i] = rand;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void test(int...arr){
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 10);
            arr[i] = rand;
        }
        System.out.println(Arrays.toString(arr));
    }





    public static void main(String[] args) {
        String str = "Test";
        int []arr = new int[10];

        test(12.1, arr);


    }
}

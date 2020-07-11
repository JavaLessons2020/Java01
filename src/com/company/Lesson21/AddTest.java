package com.company.Lesson21;

import java.util.Arrays;

public class AddTest {
    static int[] arr = new int[5];//111111
    static int full = 0;


    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            add(i);
        }
        System.out.println("метод add" + Arrays.toString(arr));

    }

    //add
    static void add(int value) {
        if (full + 1 == arr.length) {
             int[]temp = new int[arr.length * 2];
             for (int i = 0; i < arr.length; i++) {
             temp[i] = arr[i];
             }
             arr = temp;
            //arr = Arrays.copyOf(arr, arr.length * 2);//то же самое
        }
        arr[full] = value;
        full++;
    }
}

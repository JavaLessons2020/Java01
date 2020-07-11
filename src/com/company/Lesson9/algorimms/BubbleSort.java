package com.company.Lesson9.algorimms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {21, 85, 11, 44, 51, 36, 99, 81};

        long start = System.nanoTime();

        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));
        System.out.println(stop - start);
    }
}

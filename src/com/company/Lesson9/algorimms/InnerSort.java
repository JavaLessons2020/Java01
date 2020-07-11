package com.company.Lesson9.algorimms;

import java.util.Arrays;

public class InnerSort {
    public static void main(String[] args) {
        int[] array = {21, 85, 11, 44, 51, 36, 99, 81};

        int temp, j;

        long start = System.nanoTime();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));
        System.out.println(stop - start);
    }
}

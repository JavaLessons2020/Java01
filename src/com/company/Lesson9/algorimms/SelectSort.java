package com.company.Lesson9.algorimms;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] array = {21, 85, 11, 44, 51, 36, 99, 81};
        long start = System.nanoTime();

        for (int min = 0; min < array.length - 1; min++) {
            int least = min;

            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }


        long stop = System.nanoTime();
        System.out.println(Arrays.toString(array));
        System.out.println(stop - start);
    }
}

package com.company.Lesson9.algorimms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {21, 85, 11, 44, 51, 36, 99, 81};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.binarySearch(array,51));
        int first, last, num;
        first = 0;
        last = array.length;
        num = 51;
        int pos;
        pos = (first + last) / 2;

        while (array[pos] != num && (first <= last)) {
            if (array[pos] > num) {
                last = pos - 1;
            } else {
                first = pos + 1;
            }
            pos = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(num + " является " + pos + " эдементом массива");
        } else {
            System.out.println("Элемент не найден");
        }
    }
}

package com.company.Lesson9.algorimms;

public class LinearSearch {

    public static void main(String[] args) {
        int num, count;

        int[] array = {21, 85, 11, 44, 51, 36, 99};

        num = 51;

        for (count = 0; count < array.length; count++) {
            if (array[count] == num) {
                System.out.println(num + " = " + (count + 1));
                break;
            }
        }
        if (count == array.length) {
            System.out.println("Элмент не найден");
        }
    }
}
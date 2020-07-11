package com.company.Lesson29.test;


import java.util.Arrays;

public class RandomFull extends Thread {
    int array[]= new int[5];

    public RandomFull() {
        //array  = new int[5];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int cacheArray[] = new int[5];
        for (int i = 0; i < 5; i++) {
            cacheArray[i] = (int) (Math.random() * 200) - 100;
        }
        setArray(cacheArray);

        for (int i : array) {
            System.out.println(i+" ");
        }
    }

    @Override
    public String toString() {
        return "RandomFull{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

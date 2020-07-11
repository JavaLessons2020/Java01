package com.Home.test9.evgeniy.first;

import java.util.Arrays;
import java.util.concurrent.Exchanger;

public class RandomFull extends Thread {
    Exchanger<int []> exchanger;
     private volatile int array[]= new int[5];

    public RandomFull(Exchanger<int []> exchanger ) {
        this.exchanger = exchanger;
        start();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public synchronized void run() {

        int cacheArray[] = new int[5];
        for (int i = 0; i < 5; i++) {
            cacheArray[i] = (int) (Math.random() * 200) - 100;
        }
        System.out.println(Thread.currentThread().getName());
        setArray(cacheArray);

        try {
            exchanger.exchange(getArray());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        notifyAll();
    }

    @Override
    public String toString() {
        return "RandomFull{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

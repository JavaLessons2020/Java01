package com.Home.test9.evgeniy.first;

import java.util.Arrays;
import java.util.concurrent.Exchanger;

public class MiddleNumber extends Thread {
Exchanger <int []> exchanger;


    public MiddleNumber(Exchanger <int []> exchanger){
        this.exchanger = exchanger;
        start();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void run() {
        int sum = 0;


        try {
            sum = Arrays.stream(exchanger.exchange(null))
                    .sum();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int quantityNumbers = 0;

        try {
            quantityNumbers = (int) Arrays.stream(exchanger.exchange(null))
                    .count();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(Thread.currentThread().getName());

        System.out.println("Average value = " + ((double) sum) / ((double) quantityNumbers));
    }
}

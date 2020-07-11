package com.Home.test9.evgeniy.first;

import java.util.Arrays;

import java.util.concurrent.Exchanger;

public class SumArray extends Thread {

    Exchanger<int []> exchanger;

    public SumArray(Exchanger<int []> exchanger){
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
        try {
            System.out.println("Sum all numbers = "+Arrays.stream(exchanger.exchange(null))
                    .sum());
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.company.Lesson29.test;

import java.util.Arrays;
import java.util.concurrent.Exchanger;

public class MiddleNumber extends Thread {

    RandomFull randomFull;

    public MiddleNumber(){  }

    @Override
    public void run() {
        int sum = Arrays.stream(randomFull.getArray())
                .sum();

        int quantityNumbers = (int) Arrays.stream(randomFull.getArray())
                .count();

        System.out.println("Average value = " + ((double) sum) / ((double) quantityNumbers));
    }
}

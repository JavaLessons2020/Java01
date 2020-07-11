package com.company.Lesson29.test;

import java.util.Arrays;
import java.util.Random;

public class SumArray extends Thread {
    RandomFull randomFull;
    @Override
    public void run() {
        System.out.println("Sum all numbers = " + Arrays.stream(randomFull.getArray())
                .sum());
    }
}

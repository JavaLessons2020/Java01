package com.company.Lesson29;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class CountDownLatchEx {

    static class Player extends Thread {
        CountDownLatch countDownLatch;


        public Player(String name, CountDownLatch countDownLatch) {
            super(name);
            this.countDownLatch = countDownLatch;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            start();
        }


        @Override
        public void run() {
            countDownLatch.countDown();
            System.out.println("Player " + getName() + " is ready ");
            System.out.println();

            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " is running");

        }
    }


    // Synchronization demo
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch1 = new CountDownLatch(3);
        new Player("One", countDownLatch);
        new Player("Two", countDownLatch);
        new Player("Three", countDownLatch);
        new Player("Four", countDownLatch1);
        new Player("Five", countDownLatch1);
        new Player("Six", countDownLatch1);
    }
}

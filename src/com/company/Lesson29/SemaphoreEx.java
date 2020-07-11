package com.company.Lesson29;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class SemaphoreEx {

    static class Player extends Thread {
        Semaphore semaphore;


        public Player(String name, Semaphore semaphore) {
            super(name);

            this.semaphore = semaphore;

            start();
        }


        @Override
        public void run() {
            System.out.println("Player " + getName() + " is ready ");
            System.out.println();
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " is running");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
        }
    }


    // Synchronization demo
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        new Player("One", semaphore);
        new Player("Two", semaphore);
        new Player("Three", semaphore);
        new Player("Four", semaphore);
        new Player("Five", semaphore);
        new Player("Six", semaphore);
    }

}

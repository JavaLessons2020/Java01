package com.company.Lesson29;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {

    static class Player extends Thread {
        CyclicBarrier cyclicBarrier;


        public Player(String name, CyclicBarrier cyclicBarrier) {
            super(name);

            this.cyclicBarrier = cyclicBarrier;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            start();
        }


        @Override
        public void run() {

            System.out.println("Player " + getName() + " is ready ");
            System.out.println();

            try {
                cyclicBarrier.await();
            } catch (BrokenBarrierException | InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " is running");

        }
    }


    // Synchronization demo
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        new Player("One", cyclicBarrier);
        new Player("Two", cyclicBarrier);
        new Player("Three", cyclicBarrier);
        new Player("Four", cyclicBarrier);
        new Player("Five", cyclicBarrier);
        new Player("Six", cyclicBarrier);
    }
}

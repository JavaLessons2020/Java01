package com.company.Lesson28;

import java.time.LocalTime;

public class Demo2 {

    private static class WorkedThread extends Thread {
        @Override
        public void run() {
            int sum = 0;
            System.out.println("Start loop " + LocalTime.now());
            for (int i = 0; i < 2_000_000_000; i++) {
                sum += 1;
                if (isInterrupted()) {
                    System.out.println("Loop Interrupted at " + i);
                    break;
                }
            }
            System.out.println("End loop " + LocalTime.now());
        }
    }

    private static class SleeperThread extends Thread {

        @Override
        public void run() {
            System.out.println("Start sleep " + LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("End sleep " + LocalTime.now());
        }
    }

    public static void main(String[] args) throws Exception {

        Thread worker = new WorkedThread();
        Thread slipper = new SleeperThread();
        //worker.setDaemon(true);
        //slipper.setDaemon(true);

        System.out.println("Starting threads at " + LocalTime.now());
        worker.start();
        slipper.start();
        //Thread.sleep(100);


        //System.out.println("join threads");
        //slipper.join();
        ///worker.join();

        System.out.println("interrupt threads");
        //slipper.interrupt();
        worker.interrupt();




        System.out.println(Thread.currentThread().getName() + " end at " + LocalTime.now());
    }
}

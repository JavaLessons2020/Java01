package com.Home.test9.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Derby started...");

        Runnable horse = new Derby();

        Thread th = new Thread(horse);
        th.setPriority(Thread.MAX_PRIORITY);
        //Thread.sleep(20);
        th.start();

        Thread th1 = new Thread(horse);
        th1.setPriority(Thread.MIN_PRIORITY);
        th1.start();

        Thread th2 = new Thread(horse);
        th2.setPriority(Thread.MAX_PRIORITY);
        th2.start();

        Thread th3 = new Thread(horse);
        th3.setPriority(Thread.NORM_PRIORITY);
        th3.start();

        Thread th4 = new Thread(horse);
        th4.setPriority(Thread.NORM_PRIORITY);
        th4.start();

        Thread.sleep(3000);
        System.out.println("Derby finished...");
        System.out.println("--------------------");
    }
}

package com.Home.test9.example;

public class Derby implements Runnable {

    public double timeS;

    public Derby() { }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        while (true){
            timeS = timeS + 1.035005;
            if (!Thread.currentThread().isInterrupted()) {
                break;
            }
        }
        double tS = timeS;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double tF = timeS;
        double tT = tF - tS;
        System.out.println("Horse " + name + " total count " + tT);
    }
}

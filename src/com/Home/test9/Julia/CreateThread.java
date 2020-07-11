package com.Home.test9.Julia;

public class CreateThread implements Runnable {
    private int count = 0;

    public CreateThread() {
    }

    public int getCount() {
        return this.count;
    }

    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            ++this.count;
        }

    }
}

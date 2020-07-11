package com.Home.test9.Julia;

public class Run {
    public Run() {
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] thread = new Thread[5];

        int i;
        for (i = 0; i < thread.length; ++i) {
            System.out.println(thread[i] = new Thread(new CreateThread(), "Поток: " + i));
            thread[i].setPriority(1 + i * 2);
        }

        for (i = 0; i < thread.length; ++i) {
            thread[i].start();
            //thread[i].join(3000L);
        }


        for (i = 0; i < thread.length; ++i) {
            Thread.sleep(100);
            thread[i].interrupt();
        }
    }
}

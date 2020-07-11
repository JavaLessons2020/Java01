package com.company.Lesson28;

public class Demo1 {

    // Реализация интерфейса Runnable
    static class HelloRunnable  implements Runnable{

        @Override
        public void run() {
            System.out.println("Hello from runnable = " + Thread.currentThread().getName() + " " +
                    + Thread.currentThread().getId());
        }
    }

    //Наследование класса Thread */
    static class HelloThread extends Thread {

        @Override
        public void run() {
            System.out.println("Hello from Tread = " + getName() + " " +
                    + getId() );
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new HelloRunnable();
            Thread t1 = new Thread(runnable);
            t1.start();

            Thread t2 = new HelloThread();
            t2.start();


            new Thread(() -> System.out.println("Hello from Lambda = " + Thread.currentThread().getName() + " " +
                    + Thread.currentThread().getId() )).start();

        }

    }
}
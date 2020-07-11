package com.Home.test9.evgeniy.first;


import java.util.Arrays;

public class RunThreadNew {
    //При старте приложения запускаются три потока.
    //Первый поток заполняет массив случайными числами.
    //Два других потока ожидают заполнения. Когда массив
    //заполнен оба потока запускаются. Первый поток находит
    //сумму элементов массива, второй поток среднеарифметическое значение в массиве. Полученный массив, сумма
    //и среднеарифметическое возвращаются в метод main,
    //где должны быть отображены.

    // ЭТА ВЕРСИЯ НА ОДНОЙ ВКЛАДКЕ!!!!

    public static void main(String[] args) throws InterruptedException {

        MethodThread methodThread = new MethodThread();                         //программа после окончания всех потоков продолжает висеть, почему потоки не сворачиваються???
        //  InterruptedException - попытка завершить поток. Выпадает из Thread FullRandom
        Thread thread1 = new Thread(() -> {
            try {
                methodThread.fullRandom();
                //System.out.println("TEST !!! "+Thread.currentThread().getName());
                //Thread.currentThread().interrupt();                             //строка 23-27 попытка закончить поток
                //Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("State thread " + Thread.currentThread().getName() + " -> " + Thread.currentThread().isAlive());
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                methodThread.middleNumber();
                //Thread.currentThread().interrupt();                              //строка 34-38 попытка закончить поток.  В этом блоке не срабатывает исключение, почему???
               // Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("State thread " + Thread.currentThread().getName() + " -> " + Thread.currentThread().isAlive());
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                    methodThread.SumNumber();

                // Thread.currentThread().interrupt();                             //строка 45-49 попытка закончить поток.  В этом блоке не срабатывает исключение, почему???
                //Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("State thread " + Thread.currentThread().getName() + " -> " + Thread.currentThread().isAlive());
            }
        });


        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);

        thread3.start();
        Thread.sleep(100);
        thread2.start();
        Thread.sleep(100);
        thread1.start();
        Thread.sleep(100);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();


    }

    static class MethodThread {
        int[] arr = new int[3];
//        AtomicBoolean flag = new AtomicBoolean(false);

        public  synchronized void fullRandom() throws InterruptedException {
            //Thread.currentThread().setDaemon(true);
            System.out.println("Is this thread DAEMON? -->" + Thread.currentThread().isDaemon());

            Thread.currentThread().setName("full");
            System.out.println("Name of Thread -> " + Thread.currentThread().getName());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 200) - 100;
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Loop is interrapted");
                    break;
                }
            }
//            flag.set(true);
            for (int i : arr) {
                System.out.print(i + "\t");
                //Thread.sleep(1000);
            }
            System.out.println();
            notifyAll();
            //Thread.sleep(3000);
        }

        public synchronized void middleNumber() throws InterruptedException {
//            try {                                                                         // если wait расположить в начале то поток не запускаеться - почему???
//                if (flag.get()) {
//                   wait();
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            //Thread.currentThread().setDaemon(true);
            System.out.println("Is this thread DAEMON? -->" + Thread.currentThread().isDaemon());

            Thread.currentThread().setName("middle");
            System.out.println("Name of Thread -> " + Thread.currentThread().getName());
            int sum = Arrays.stream(arr)
                    .sum();
            int quantityNumbers = (int) Arrays.stream(arr)
                    .count();
            System.out.println("Average value = " + ((double) sum) / ((double) quantityNumbers));
            //Thread.sleep(3000);
//            try {
//                //               if (flag.get()) {                                                           //почему методы Thread можно использовать до открытия потока???
//                wait();                                                                    // если wait расположить в начале то поток не запускаеться - почему???
//                //               }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

        public synchronized void SumNumber() throws InterruptedException {
//            try {
//                if (flag.get()) {
 //                   wait();
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            // Thread.currentThread().setDaemon(true);
            System.out.println("Is this thread DAEMON? -->" + Thread.currentThread().isDaemon());

            Thread.currentThread().setName("summary");
            System.out.println("Name of Thread -> " + Thread.currentThread().getName());
            System.out.println("Sum all numbers = " + Arrays.stream(arr)
                    .sum());
            //Thread.sleep(3000);
//            try {
//                //               if (flag.get()) {
//               wait();
//                //              }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

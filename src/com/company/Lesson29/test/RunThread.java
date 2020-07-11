package com.company.Lesson29.test;



import java.util.Arrays;

public class RunThread {
    //При старте приложения запускаются три потока.
    //Первый поток заполняет массив случайными числами.
    //Два других потока ожидают заполнения. Когда массив
    //заполнен оба потока запускаются. Первый поток находит
    //сумму элементов массива, второй поток среднеарифметическое значение в массиве. Полученный массив, сумма
    //и среднеарифметическое возвращаются в метод main,
    //где должны быть отображены.
    public static void main(String[] args) {
        RandomFull randomFull = new RandomFull();
        MiddleNumber middleNumber = new MiddleNumber();
        SumArray sumArray = new SumArray();

        System.out.println("Start random full array.");

        randomFull.start();

        for (int num : randomFull.getArray()) {
            System.out.println(num + " ");
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(randomFull.array[i] + " ");
//        }
        //new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

    private  void concurrencyRace() throws InterruptedException {
        int[] arr = new int[2_000_000];

        Thread full = new Thread(() -> {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 200) - 100;
            }
        });

        Thread middle = new Thread(() -> {
            int sum = Arrays.stream(arr)
                    .sum();
            int quantityNumbers = (int) Arrays.stream(arr)
                    .count();
            System.out.println("Average value = " + ((double) sum) / ((double) quantityNumbers));
            System.out.println(Thread.currentThread().getName());
        });

        Thread summary = new Thread(() -> {
            System.out.println("Sum all numbers = " + Arrays.stream(arr)
                    .sum());
        });

        full.start();
        middle.start();
        summary.start();


        full.join();
        middle.join();
        summary.join();


    }
}

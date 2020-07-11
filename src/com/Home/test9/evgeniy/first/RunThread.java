package com.Home.test9.evgeniy.first;

import java.util.concurrent.Exchanger;

public class RunThread {
    //При старте приложения запускаются три потока.
    //Первый поток заполняет массив случайными числами.
    //Два других потока ожидают заполнения. Когда массив
    //заполнен оба потока запускаются. Первый поток находит
    //сумму элементов массива, второй поток среднеарифметическое значение в массиве. Полученный массив, сумма
    //и среднеарифметическое возвращаются в метод main,
    //где должны быть отображены.
    public static void main(String[] args) {
        Exchanger<int []> exchanger = new Exchanger<>();

        RandomFull randomFull = new RandomFull(exchanger);
        MiddleNumber middleNumber = new MiddleNumber(exchanger);
        SumArray sumArray = new SumArray(exchanger);

    }
}

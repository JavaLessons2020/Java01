package com.company.Lesson3;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {


//            //true
//        if(false){
//            System.out.println("Выражение верно");
//        }else if(true){
//            System.err.println("Выражение НЕ верно");
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        //System.out.println("Ваш возраст = " + age);

        if (age < 18 || age > 23) {
            System.out.println("Вы нам не подходите");
            if (age > 23 && age < 65) {
                System.out.println("Вы уже должны работать");
            } else if (age < 18 && age > 6) {
                System.out.println("Вы не окончили школу");
            }
        } else {
            System.out.println("Вы нам подходите");
        }
        scanner.close();





        //0 - 24
        //3 - 12 = утро
        //12 - 18 = день
        //18 - 24 = вечер
        //24 или 0 - 3 = ночь


//        int num =523;
//
//        System.out.println(num/100);
//        System.out.println(num / 10 % 10);
//        System.out.println(num % 10);


    }
}

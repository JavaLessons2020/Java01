package com.company.Lesson10.practica;

import java.util.Scanner;

public class Exersize1 {

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 0) {
                if (isPrime(num)){
                    System.out.println("Вы ввели простое число");
                }else {
                    System.out.println("Все делители этого числа");
                    for (int i = (int) Math.sqrt(num); i >= 2 ; --i) {
                        if(num%i == 0&&isPrime(i)){
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                }
            }else {
                System.out.println("Число 0 или меньше 0");
            }
        }else {
            System.out.println("Не целочисленное число ");
        }

    }
}

package com.company.Lesson2;

import java.io.BufferedWriter;
import java.io.Writer;
import java.util.Scanner;

public class EnterDataExample {
    public static void main(String[] args) {
        //создаем экземпляр классса Scanner
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Как вас зовут?");
//        String name = scanner.nextLine();
//        System.out.println("name = " + name);
//        System.out.println("Ввведите пожалуйста превое число: ");
//        int first = scanner.nextInt();
//        System.out.println("Мое первое чиисло = " + first);
//        System.out.println("Введите номер телефона = ");// +38(0)
//        String phone = scanner.next();
//        System.out.println("phone = " + phone);
        System.out.println("Введите ФИО и возраст");
        String str = scanner.next();
        int a = scanner.nextInt();
        System.out.println("str = " + str + " " + "age = " + a);

        scanner.close();
    }
}

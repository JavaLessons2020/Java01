package com.company.Lesson5;


import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
//        //вывести алфавит
//        char ch = 'A';
//        while (ch <= 'Z') {
//            System.out.print(ch + " ");
//            ch++;
//        }
//        System.out.println();


//        int e;
//        int res = 0;
//        int i;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int a = scanner.nextInt();
//        System.out.println("Введите степень");
//        int s = scanner.nextInt();
//
//        for (i = 1; i <=s; i++) {
//            res = 1;
//            e = i;
//            while (e > 0) {
//                res *= a;
//                e--;
//            }
//        }
//
//        System.out.println(a + " в степени  = " + (i - 1) + " равна " + res);
        // System.out.println(Math.pow(2, 9));

//        int i = 100;
//        int j = 200;
//
//        while (++i < --j) ;
//        System.out.println("Значние i = " + i);
//        System.out.println("Значние j = " + j);


        //do while

        int num = 0;
        do {
            System.out.println("такт = " + num);
            num--;
        } while (num > 0);
        System.out.println(num);

//        while (num > 0) {
//            System.out.println("такт = " + num);
//        }

    }
}

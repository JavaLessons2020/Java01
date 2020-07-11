package com.company.Lesson5;

import java.util.Scanner;

public class BreakContinueEx {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        System.out.println("After loop");
//    }

        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            System.out.println("Вводите данные");
//            int i = scanner.nextInt();
//            if (i == 7) {
//                break;
//            }
//        }

//        for (int i = 1; i < 10; i++) {
//            System.out.println( i + " x " + 7 + " = " + i*7);
//        }


        //1. Определить количество цифр в введённом числе.

//        System.out.println("Вводите данные");
//        if (scanner.hasNextInt()) {
//            int num = scanner.nextInt();
//            int i = 0;
//            do {
//                num /= 10;
//                i++;
//
//            } while (num > 0);
//            System.out.println(i);
//        } else {
//            System.out.println("Данные не соотвтетсвуют");
//        }


//        int num = 100;
//        for (int i = 0; i < num; i++) {
//            if (i * i == num) {
//                break;
//            }
//            System.out.println(i);
//        }
//    }

        for (int i = 0; i < 3; i++) {
            System.out.print("счетчик внешнего цикла " + i + " ");
            System.out.println("счетчик внутреннего цикла ");
            int t = 0;
            while (t < 100) {
                if (t == 10) {
                    break;
                }
                System.out.print( + t + " ");
                t++;
            }
            System.out.println();
        }

        //0 = 0
        //1 = 01
        //2 = 012
        //3 = 0123
        //4 = 01234
        //5 = 012345


        for (int i = 5; i > 0 ; i--) {
//            for (int j = 5; j > 0 ; j--) {
//                System.out.print(" ");
//            }
            for (int j = 0; j < i*3 -2; j++) {
                System.out.print("#");
            }
            System.out.println();
        }


    }

}
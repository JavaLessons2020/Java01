package com.company.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {
    public static void main(String[] args) {
        int r = 10 + (int) (Math.random() * 41);

        System.out.println("Random1 = " + r);

        Random random = new Random();
        int i = random.nextInt(20);
        i += 10;
        System.out.println("Random2 = " + i);


        Scanner scanner = new Scanner(System.in);
        System.out.println("+-/*");
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println(a + " "+ b);
        String ch = scanner.next();
        if (ch.length() <= 1){
            switch (ch){
                case "+":
                    System.out.println(a+b);
                    break;
                case "/":
                    if(b!=0){
                        System.out.println((double) a/b);
                    }else {
                        System.out.println("!!!/0!!!");
                    }
            }
        }else {
            System.out.println("Символов больше 1");
        }
    }
}

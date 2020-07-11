package com.consultation.Lesson1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class MultiArr {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        int[][] arr1 = {
                {9, 2, 6},  //0
                {7, 5, 3},  //1
                {4, 8, 1}   //2
        };



        String str = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. \n" +
                "A aliquam architecto consequatur, debitis dignissimos ducimus earum exercitationem,\n" +
                "facere illum iure laboriosam mollitia praesentium similique sint,\n" +
                "ullam vero voluptas voluptate voluptatibus.";

        //поиск max в строке
//        for (int i = 0; i < 3; i++) {
//            int max = arr1[i][0];
//            for (int j = 0; j < 3; j++) {
//                if(arr1[i][j] >max){
//                    max = arr1[i][j];
//                }
//            }
//            System.out.println(max);
//        }

        //поиск max в столбце
//        for (int i = 0; i < 3; i++) {
//            int max = arr1[0][i];
//            for (int j = 0; j < 3; j++) {
//                if(arr1[i][j] >max){
//                    max = arr1[i][j];
//                }
//            }
//            System.out.println(max);
//        }
        //поиск max в любой части матрицы
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (i <= j && (arr1[i][j] > max)) {
//                    max = arr1[i][j];
//                    System.out.print(arr1[i][j] + " ");
//                } else {
//                    System.out.print("");
//                }
//            }
//            System.out.println();
//        }

        //System.out.println(arr);



        //Составить программу вывода любого числа любое заданное число раз
        // (запросить у пользователя) в виде, аналогичному выше.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество");
        int col = sc.nextInt();
        System.out.println("Введите число");
        int num = sc.nextInt();

        for (int i = 0; i < col; i++) {
            if(i%10==0){
                System.out.println();
            }
            System.out.print(num + " ");
        }

    }
}

package com.company.Lesson11;

import java.util.Random;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        // * Задние3.Заполните n мерный квадратный массив числами, которые увеличиваются на 1 по
        // * спирали (число n должно задаваться с клавиатуры). Выведите результат на экран
        // * с соблюдением ширины столбцов. Выполнить задачу с использованием только одного цикла.
        // * Для примера массив 4 на 4 должен выглядеть как
        // * указано ниже.
        // *
        // *   1  2  3  4
        // *  12 13 14  5
        // *  11 16 15  6
        // *  10  9  8  7
        int size = 0;
        int iteration = 1;
        int i = 0;
        int j = 0;
        int myIter = 1;
        int step = 0;
        int coefficient = 0;
        int number = 1;
        boolean end = true;


        //Verges square
        final int upVerge = 1;
        final int rightVerge = 2;
        final int downVerge = 3;
        final int bottomVerge = 4;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        //Enter size array
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            if (!scanner.hasNextInt()) {
                System.err.println("You enter not integer! Repeat enter!");
                while (true) {
                    scanner = new Scanner(System.in);
                    if (scanner.hasNextInt()) {
                        size = scanner.nextInt();
                    } else {
                        System.err.println("You enter not integer! Repeat enter!");
                    }
                }
            }
        }

        //Create array n*n
        int array[][] = new int[size][size];

        while (end) {

            //calculation myIter, step, coefficient
            if (iteration == (myIter * size - step + 1)) {
                myIter++;
                if ((myIter) % 2 == 0) {
                    coefficient++;
                }
                step += coefficient;
            }

            //filling out array
            if (myIter % 4 == 1) {
                if (iteration > size) {
                    j++;
                }
                array[i][j] = number;
                if (iteration < size) {
                    j++;
                }
            } else if (myIter % 4 == 2) {
                i++;
                array[i][j] = number;
            } else if (myIter % 4 == 3) {
                j--;
                array[i][j] = number;
            } else if (myIter % 4 == 0) {
                i--;
                array[i][j] = number;
            }

            number++;
            iteration++;

            //Stop cycle
            if (iteration == size * size + 1) {
                end = false;
            }
        }

        //console output
        for (int k = 0; k < size; k++) {
            for (int l = 0; l < size; l++) {
                System.out.print(array[k][l] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}

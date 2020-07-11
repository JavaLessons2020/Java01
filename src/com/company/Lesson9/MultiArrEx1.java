package com.company.Lesson9;

public class MultiArrEx1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];

        int temp = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = temp + 1;
                temp++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        //int [][][]arr3 = new int[3][][];

// * Создать квадратный массив размерностью NxN заполненный случайными числами,
// * вывести массив на экран в виде таблицы, найти наименьший и наибольший элемент
// * массива и вывести их на экран (если найдено несколько одинаковых элементов —
// * вывести через запятую индексы строки и столбца, где есть повторения).
// * Размерность массива должна задаваться с клавиатуры.




    }
}

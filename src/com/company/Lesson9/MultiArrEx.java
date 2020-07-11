package com.company.Lesson9;


public class MultiArrEx {
    public static void main(String[] args) {


        int[][] arr = new int[3][3];

        //[0][0] [0][1] [0][2]
        //[1][0] [1][1] [1][2]
        //[2][0] [2][1] [2][2]


        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //System.out.println(arr1[1][1]);

        int temp = 0;
        int[][] arr2 = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = temp+1;
                temp++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


    }
}

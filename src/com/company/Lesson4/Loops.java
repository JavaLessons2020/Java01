package com.company.Lesson4;

public class Loops {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++){
//            System.out.println(i + ") Hello");
//        }


//        for(int i = 10; i > 0; i--){
//            System.out.println(i);
//        }

//        int i = 5;
//        for (;i>-5;){
//            System.out.println(i);
//            i--;
//        }
//
//        System.out.println("iter = " + i);

//        for(;;){
//            System.out.println("infinity loop");
//        }

//        int i, j;
//        for (i = 0, j = 10; i <= j; i++,j-- ){
//            System.out.print("i =  " + i + " " );
//            System.out.println("j =  " + j);
//        }


        //факториал числа
//        int f = 1;
//        int i;
//        for (i = 1; i <= 7; i++){
//            f *= i;
//        }
//        System.out.println("Факториал " + (i - 1) +" = " + f);

        //сумма чисел в диапазоне 1 - 100
        int sum = 0;
        for (int i = 1; i<=10; i++){
            sum+=i;
        }

        System.out.println("Сумма чисел от 1-10 = " + sum);
    }


}

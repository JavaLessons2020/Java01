package com.company.Lesson11;

public class Recursion {

    private static void foo(int arg) {
        System.out.print(" " + arg);

        //if(arg < 7){
         foo(arg + 1);
        //}
    }

    public static void main(String[] args) {
        //Есть 3 способа повтоить много раз одно и то же действие
        //1)На основе циклов
        //2)На основе рекурси
        foo(1);

//        int arg = 0;
//        while (true){
//            System.out.println(arg);
//            arg+=1;
//        }

        //Рекурсия бывает
        //1)Прямая и косвенная
        //2)С ветвлением(это когда в методе foo будет выван метод foo несколько раз) и без ветвления



    }
}

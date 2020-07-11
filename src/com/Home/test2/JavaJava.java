package com.Home.test2;

public class JavaJava {
    public static void main(String[] args) {
//        В строке -"Hello world! Hello Java!! Hello JavaScript!!! JavaSE 8.";
//        1.Найти и вывести в консоль все слова содержащие Java
//        2.Разбить текст на слова и вывести в консоль.
//        Слова не должны содержать знаков препинания-т.е вывод word, а не world!
//        3.Заменить слово Hello на Hi и вывести получившеюся строку

        String str = "Hello world! Hello Java!! Hello JavaScript!!! JavaSE 8.";



//1 задание
        //String[] split = str.split("[.,&!?\\-() ]");
//        for (String string : split) {
//            if(string.startsWith("Java")){
//                System.out.println(string);
//            }
//        }
// 2 задание

        String[] split = str.split("[.,&!?\\-() ]");
        for (String string : split) {
            System.out.println(string);
        }

        //3 заменить Hello на Hi
        String replace = str.replace("Hello", "Hi");
        System.out.println(replace);
    }
}

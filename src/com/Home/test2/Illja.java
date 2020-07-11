package com.Home.test2;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Illja {
    //Написать программу , которая в тексте

//-Polymorphism refers to a feature of Java that allows an object of a superclass to refer to an object of
//    any subclass. This is possible because all objects of a base class are also objects of its superclass. For
//    example, assume that all circles are represented by a class called Circle, which is a subclass of the
//    class Shape (which thus is the superclass of Circle). Further assume that Triangle is another subclass
//    of Shape. Now assume that Shape has a method draw(). You can implement these classes in
//    such a way that when you invoke the draw() method on a Shape variable (referring to an object of
//    Triangle), it draws a triangle, and when you invoke the same method on the same Shape variable
//            (which now is referring to an object of Circle), it draws a circle. It is the same method of the Shape
//    class with different implementations in the subclasses.
//
//
//
//
//    Разбивает тест на предложения
//    Подсчитывает количество повторений слова  class
//    Находит количество артиклей a
//                    Находит самое длинное слово в тексте.
//    Задания 1-3 -10 б , кто сделает еще и 4 -12б

    public static void main(String[] args) {
        String str = "-Polymorphism ";
        String[] split = str.split("[.,&?\\-() ]");
        String max = "";
        for (String string : split) {
            if(string.length()>max.length()){
                max = string;
            }
        }
        System.out.println(max);

    }
}

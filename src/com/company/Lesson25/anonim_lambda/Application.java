package com.company.Lesson25.anonim_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void printApp(int a) {
        System.out.println("printApp");
    }

    public static void printJava(int a) {
        System.out.println("printJava");
    }

    public static void printCPP(int a) {
        System.out.println("printCPP");
    }


    public static void main(String[] args) {
        Developer developer = new Developer();
        JavaProject java = new JavaProject();
        CPPProject cpp = new CPPProject();

        //подписка на событие
/*        developer.enjoyWork = java;
        developer.enjoyWork = cpp;*/

        developer.addEnjoy(java);
        developer.addEnjoy(cpp);

//        class Python implements EnjoyWork {
//
//            public void writeCode() {
//                System.out.println("Код на Python пишется");
//            }
//
//            @Override
//            public void letsCode() {
//                writeCode();
//            }
//        }
        //анонимные классы
        developer.addEnjoy(new EnjoyWork() {//анонимный класс реализующий интерфейс EnjoyWork
            @Override
            public void letsCode(int a) {
                System.out.println("Код на Python пишется");
            }
        });

        //лямбда выражения вызов метода letsCode
        developer.addEnjoy(a -> System.out.println("Код на JS пишется"));
        developer.addEnjoy(a -> System.out.println("Код на JS пишется"));
        //строка 57
        developer.addEnjoy(Application::printCPP);
        //то же самое что и строка 57
        developer.addEnjoy(new EnjoyWork() {
            @Override
            public void letsCode(int a) {
                Application.printCPP(a);
            }
        });
        developer.doWork();

    }
}

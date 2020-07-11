package com.company.Lesson10;

public class Modifires {

    static private int a1;//виден только в этом классе
    static protected int a2;// виден только в классах наследниках
    static public int a3;//виден в любой точке проекта
    static int a4;//default -  виден только в текущем пакете


    public static void main(String[] args) {
        System.out.println("Modifires Modifires");
//        {
//            int a = 10;
//            {
//                System.out.println(a);
//            }
//            System.out.println(a);
//        }
//        System.out.println(a);
//    }
//        a1 = 10;
//        a2 = 20;
//        a3 = 40;
//        a4 = 15;
//        System.out.println(a1 + " " +a2 +" " + a3 + " " + a4);

    }
}

package com.company.Lesson10;

//import static com.company.Lesson10.A.hello;



import java.util.Arrays;

public class Methods {

    static void hello() {
        System.out.println("Hello World");
    }

//    public static int sum() {
//        return  4 + 5;
//    }

    public static void sum (int first, int second, int res){
        res = first - second;
        System.out.println(res);
    }

   public static int sum(int first, int second) {
        return  first + second;
    }

    public static int[] sum(int first, int second, int res, int start) {
        int [] a = new int[0];
        return  a;
    }

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        A.hello();
        A.hello();

        //String str = "hello";
        //String string = String.valueOf(124);

        Math.sqrt(9);
        String str1 = "";

        int f = 12;
        int s = 23;
        System.out.println(sum(f, s));

        sum(12, 45);

        Modifires modifires = new Modifires();
        modifires.a3 = 10;

    }
}

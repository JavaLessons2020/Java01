package com.company.Lesson31;

public class Test {
    public void test(){
        Calculator calculator = new Calculator();
        int a = 11;
        int b = 20;
        int res = calculator.sum(a, b);
        int exp = 30;
        if(res==exp){
            System.out.println("res = " + res + " is OK");
        }else {
            System.err.println("Not OK");
        }
    }
}

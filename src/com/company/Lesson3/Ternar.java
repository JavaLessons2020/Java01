package com.company.Lesson3;

public class Ternar {
    public static void main(String[] args) {

        String ifStr;
        if (12 > 3) {
            ifStr = "Да if";
        }else if(13<4){
            ifStr = "Да";
        }else{
            ifStr = "Нет";
        }

        String str = 12 > 3 ? "Да tern": "Нет tern";
        System.out.println(12 > 3 ? "Да tern": "Нет tern");
        String s = 12 > 3?"Да tern": 13 < 4? "Да" : "Нет";


    }
}

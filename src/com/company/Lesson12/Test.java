package com.company.Lesson12;

public class Test {


    //Пользователь вводит пароль только цифры и буквы.(строка)
    //Правила пароля:
    //*пароль содержит не менне 8 символов
    //*пароль состоит из цифр и букв
    //*пароль должен содержать не менее 2х цифр(и не менее 1 символа)
    public static void main(String[] args) {
//        char ch = 'A';
//        char ch1 = 'Z';
//
//        //'0' - '9'
//
//        while (true){
//            if(ch!=('Z'+1)){
//                System.out.print(ch+" ");
//                ch+=1;
//            }
//        }


    }

    public static boolean isValid() {
        int letter = 0;
        int num = 0;
        String str = "1234GQ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isLetter(ch)) {
                letter++;
            }
               if (isNumeric(ch)) {
                   num++;
               }

        }
        return (letter>=1 && num>=2);
    }


    private static boolean isLetter(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z');
    }

    private static boolean isNumeric(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= '0' && ch <= '9');
    }
}
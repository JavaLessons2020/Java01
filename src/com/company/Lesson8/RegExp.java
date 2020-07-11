package com.company.Lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {

        String string = "lorem-12 ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n"
                + "ut enim ad minim veniam, quis nostrud 15/04/2020 exercitation ullamco 46program@gmail.com laboris nisi ut aliquip ex ea commodo consequat. \n\n"
                + "15:04:2020.\n\n"
                + "duis aute irure-55787 dolor in reprehenderit in voluptate velit esse cil-23 dolore eu fugiat nulla pariatur. Excepteur 15 04 2020 sint occaecat cupidatat non proident, sunt in culpa 333  qui officia deserunt mollit anim id est laborum.";

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(string);

//        while (matcher.find()) {
//            System.out.println(matcher.start());//начальный индекс совпадения
//            System.out.println(matcher.end());//конечный индекс совпадения
//        }
        String email = "46program@gmail.com";
        if(email.matches("\\w+@\\w+\\.\\w+")){
            System.out.println("это валидный пароль");
            System.out.println(email.replaceAll("@+\\.+", "@ukr.net"));

        }else {
            System.out.println("пароль не валидный");
        }


    }
}

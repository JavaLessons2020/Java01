package com.company.Lesson3;

public class Switch {
    public static void main(String[] args) {

        int month = 3;

        switch (month) {
            case 3:
                System.out.println("МАРТ");
            case 4:
                System.out.println("АПРЕЛЬ");

            case 5:
                System.out.println("МАЙ");
                break;
            case 6:
                System.out.println("ИЮНЬ");
        }

        //Ctrl+Alt+L = автовыранивание

        String time = "май";

        switch (time) {
            default:
                System.out.println("Не один из вариантов не подошел");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("Весна");
                break;
        }
    }
}

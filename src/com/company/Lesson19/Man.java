package com.company.Lesson19;

public class Man {

    boolean gender;
    Enum eyeColor;
    Month month;


    public Man(boolean gender, Enum eyeColor, Month month) {
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Man{" +
                "gender=" + gender +
                ", eyeColor=" + eyeColor +
                '}';
    }
}

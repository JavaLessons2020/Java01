package com.company.Lesson17.example1;

public class Type {
    int type;
    String str;
    double d;
    char ch;

    public Type(int type, String str, double d, char ch) {
        this.type = type;
        this.str = str;
        this.d = d;
        this.ch = ch;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type=" + type +
                ", str='" + str + '\'' +
                ", d=" + d +
                ", ch=" + ch +
                '}';
    }
}

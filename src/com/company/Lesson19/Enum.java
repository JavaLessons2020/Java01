package com.company.Lesson19;

import java.util.ArrayList;
import java.util.Arrays;

public enum Enum {
    RED(1),
    GREEN(2),
    BLUE(3),
    BROWN(4);

    private int e;

    private Enum(int e) {
        this.e = e;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "e=" + e +
                '}';
    }
}


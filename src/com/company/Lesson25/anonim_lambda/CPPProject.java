package com.company.Lesson25.anonim_lambda;

public class CPPProject implements EnjoyWork {

    public void writeCode() {
        System.out.println("Код на C++ пишется");
    }

    @Override
    public void letsCode(int a) {
        writeCode();
    }
}

package com.company.Lesson25.anonim_lambda;

public class JavaProject implements EnjoyWork {

    public void writeCode() {
        System.out.println("Код на Java пишется");
    }

    @Override
    public void letsCode(int a) {
        writeCode();
    }
}

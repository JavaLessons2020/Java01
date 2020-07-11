package com.company.Lesson25.anonim_lambda;

import java.util.ArrayList;
import java.util.List;

public class Developer {

    public List <EnjoyWork> enjoy = new ArrayList<>();

    public void addEnjoy(EnjoyWork enjoyWork){
        enjoy.add(enjoyWork);
    }

    public void doWork() {
        System.out.println("Разработчик делает работу");
//        if (enjoyWork != null) {
//            enjoyWork.letsCode();
//        }
        for (EnjoyWork enjoyWork : enjoy) {
            enjoyWork.letsCode(12);
        }
    }
}

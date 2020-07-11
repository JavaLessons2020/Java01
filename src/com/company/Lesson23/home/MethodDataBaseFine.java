package com.company.Lesson23.home;

import java.io.File;
import java.util.Set;

public class MethodDataBaseFine {
    private DataBaseFine dataBaseFine;


    public MethodDataBaseFine() {
        dataBaseFine = new DataBaseFine();
        //создание дефолтной базы штрафов
        dataBaseFine.defaultDataBaseFine();
    }


    public void printDataBase() {
        System.out.println(dataBaseFine.toString());
    }

//    public void printTypeFine(String fine) {
//
//        int size = dataBaseFine.getPersons().size();
//        for (int i = 0; i < size; i++) {
//            if (dataBaseFine.getPersons().get(i).getFine().getFines().keySet() == new Set) {//!!!!!!!!!!!!!!
//                System.out.println(dataBaseFine.getPerson().toString());
//            }
//        }
//    }


}


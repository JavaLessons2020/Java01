package com.Home.test7;

import java.util.HashMap;
import java.util.Map;

public class Fine {
    private String nameFine;
    private Integer sumFine;
    private Map<String, Integer> fines = new HashMap<>();


    public Fine(){ }

    public Fine(Map<String, Integer> fines) {
        this.fines = fines;
    }

    public Map<String, Integer> getFines() {
        return fines;
    }

    public void setFines(Map<String, Integer> fines) {
        this.fines = fines;
    }

    public String getNameFine() {
        return nameFine;
    }

    public void setNameFine(String nameFine) {
        this.nameFine = nameFine;
    }

    public Integer getSumFine() {
        return sumFine;
    }

    public void setSumFine(Integer sumFine) {
        this.sumFine = sumFine;
    }


    //добавление нового элемента в мар files - в dataBaseFine запускаеться в while(true)
    public void creatureElementMapFines(String nameFine, Integer sumFine) {
        fines.put(nameFine, sumFine);
    }


    @Override
    public String toString() {
        return "Fine{" +
                "fines=" + fines +
                '}';
    }
}

package com.Home.test7;

import java.util.Set;

public class MethodDataBaseFine  {
    private DataBaseFine dataBaseFine;

    public MethodDataBaseFine() {
        dataBaseFine = new DataBaseFine();
        //создание дефолтной базы штрафов
        dataBaseFine.defaultDataBaseFine();

    }


    public void printDataBase() {
        System.out.println(dataBaseFine.toString());
    }

    public int sizeData() {
        return dataBaseFine.getPersons().size();
    }


    public void printCodePeopleFine(Integer code) {
        for (int i = 0; i < sizeData(); i++) {
            Integer personCode = dataBaseFine.getPersons().get(i).getPersonCode();
            if (personCode == code) {
                System.out.println(dataBaseFine.getPersons().get(i).toString());
            }
        }
    }

    public void printTypeFine(String fine) {
        Set<String> keySet;
        for (int i = 0; i < sizeData(); i++) {
            keySet = dataBaseFine.getPersons().get(i).getFine().getFines().keySet();
            if (keySet.contains(fine)) {
                System.out.println(dataBaseFine.getPersons().get(i).toString());
            }
        }
    }

    public void printCityFine(String nameCity) {
        for (int i = 0; i < sizeData(); i++) {
            String personCity = dataBaseFine.getPersons().get(i).getCity();
            if (personCity.equalsIgnoreCase(nameCity)) {
                System.out.println(dataBaseFine.getPersons().get(i).toString());
            }
        }
    }

    public void addNewPerson(Integer inn,String city, Fine fine){
        dataBaseFine.getPersons().add(new Person(inn,city, fine));
    }

    //проверка на наличее ИНН в базе
    public boolean checkAvailableCodePerson(Integer inn){
        for (int i = 0; i <sizeData() ; i++) {
            if(inn == dataBaseFine.getPersons().get(i).getPersonCode()){
                return false;
            }
        }
        return true;
    }



}


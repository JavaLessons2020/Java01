package com.company.Lesson18.students;

public class Student {
    String fio;
    int year;
    //int [] rating = new int[3];
int rating1, rating2, rating3;
    public Student() {
        fio = "";
        year = 0;
    }

    public Student(String fio) {
        this.fio = fio;
        year = 0;
    }

    public Student(String fio, int year, int[] rating) {
        this.fio = fio;
        this.year = year;
        //this.rating = rating;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

       void  setMarks(int rating1, int rating2, int rating3){
        this.rating1 = rating1;
        this.rating2 = rating1;
        this.rating3 = rating1;
       }

    double average(){
        return 0.0;
    }
}

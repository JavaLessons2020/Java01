package com.company.Lesson18.students;

public class ListStudents {

    String name;
    Student [] students;

    public ListStudents() {
        this.name = "";
        students = new Student[5];
        for (int i = 0; i <students.length; i++) {
            students[i] = new Student();
        }
    }

    public ListStudents(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    void  print(){
        for (int i = 0; i < students.length; i++) {

        }
    }
}

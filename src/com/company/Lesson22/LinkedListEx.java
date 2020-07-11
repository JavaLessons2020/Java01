package com.company.Lesson22;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;


class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList<>();
        //linkedList.add(new Student("Ivan"));
        linkedList.add(null);
        linkedList.addFirst(new Student("First"));
        linkedList.addLast(new Student("Last"));
        //System.out.println(linkedList.get(0));

//        for (Student student : linkedList) {
//            System.out.println(student);
//        }

//      Iterator<Student> iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            Student nextStudent = iterator.next();
//            System.out.println(nextStudent);
//        }


        ListIterator<Student> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            Student nextStudent = listIterator.previous();
            System.out.println(nextStudent);
        }

    }
}

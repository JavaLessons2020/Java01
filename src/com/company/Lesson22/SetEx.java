package com.company.Lesson22;

import java.util.*;


class DeveloperSalary implements Comparator<Developer>{

    @Override
    public int compare(Developer o1, Developer o2) {
        return o1.salary - o2.salary;
    }
}

class Developer implements Comparable<Developer>{
//class Developer implements Comparator<Developer> {
    String email;
    String name;
    int salary;

    public Developer() {

    }


    public Developer(String email, String name, int salary) {
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Developer o) {
        //return name.compareTo(o.name);
        return salary - o.salary;
    }



//    @Override
//    public int compare(Developer o1, Developer o2) {
//        return o1.salary - o2.salary;
//    }


    @Override
    public String toString() {
        return "Developer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }



    //    @Override
//    public int compare(Developer o1, Developer o2) {
//        return o1.email.compareTo(o2.email);
//    }
}

public class SetEx {
    public static void main(String[] args) {
        //LinkedList<Integer> intList = new LinkedList<>();
        Set<Integer> intSet = new HashSet<>();
//        System.out.println("first = " + intSet.add(1));
//        System.out.println("second = " + intSet.add(1));
//        System.out.println("third = " + intSet.add(2));
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
//        for (Integer integer : intSet) {
//            System.out.println(integer);
//        }

        Set<Developer>developers = new HashSet<>();
        //Set<Developer>developers = new LinkedHashSet<>();
        //LinkedList<Developer> developers = new LinkedList<>();
        //ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Duglas", "4244", 4000));
        developers.add(new Developer("Bogdan", "2345", 2000));
        developers.add(new Developer("Alex", "1456", 1000));
        developers.add(new Developer("Clint", "3567", 1000));


        for (Developer developer : developers) {
            System.out.println(developer);
        }
        System.out.println("================");

        Comparator<Developer> dcomp = new DeveloperSalary();
        //Collection<Developer>developersTree = new TreeSet<>(dcomp);
        Collection<Developer>developersTree = new TreeSet<>(developers);
        //Collection<Developer>developersTree = new TreeSet<>(developers);
        //ArrayList<Developer> developerArrayList = new ArrayList<>(developers);
        //developerArrayList.add(new Developer("Evgen", "0678", 5000));
        developersTree.add(new Developer("Evgen1", "1678", 5000));
//        developersTree.add(new Developer("Evgen2", "4678", 2000));
//        developersTree.add(new Developer("Evgen3", "6678", 4000));
//        developersTree.add(new Developer("Evgen4", "4678", 3000));
//        developersTree.add(new Developer("Evgen5", "3678", 1000));

//        Developer developer1 = new Developer();
//        developerArrayList.sort(developer1);


//        for (Developer developer : developerArrayList) {
//            System.out.println(developer);
//        }


        for (Developer developer : developersTree) {
            System.out.println(developer);
        }



    }

//    @Override
//    public int compare(Developer o1, Developer o2) {
//        return o1.email.compareTo(o2.email);
//    }


}

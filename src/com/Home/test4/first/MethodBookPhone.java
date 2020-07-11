package com.Home.test4.first;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MethodBookPhone {

    boolean result = false;

    Person arrayPerson[];

    public MethodBookPhone() {
         arrayPerson = new Person[] {
                new Person("Иванов Иван", "777-12-321", "788-12-365", "063-984-20-20", "ХЗ знает кто"),
                new Person("Петров Петр Птрович", "777-12-322", "064-999-27-20", "097-053-02-15", "Какой-то чел"),
                new Person("Сидоров Сидор", "777-69-89", "789-15-28", "050-485-22-69", "Мужик мимо проходил"),
                new Person("Мирошниченко Игорь Миронович", "752-56-42", "050-559-12-07", "064-558-39-87", "Кто-то левый"),
                new Person(null, null, null, null, null)
        };
    }

    //create new contact
    public void addNewContact() {
        int indexArrayFirstNull = 0;
        //enter name(necessarily!!!)
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name person");
            String nameAdd = scanner.nextLine();
            if (nameAdd.isEmpty()) {
                System.err.println("You enter line is empty!!!");
            } else {
                for (int i = 0; i < arrayPerson.length; i++) {
                    if (arrayPerson[i].getName() == null) {
                        indexArrayFirstNull = i;
                        arrayPerson[indexArrayFirstNull].setName(nameAdd);
                        System.out.println(arrayPerson[indexArrayFirstNull]);

                        break;
                    } else if (i == arrayPerson.length - 1 && arrayPerson[i].getName() != null) {
                        //Arrays.copyOf(arrayPerson, arrayPerson.length + 5);
                        indexArrayFirstNull = arrayPerson.length - 4;
                        System.out.println("indexArrayFirstNull = " + indexArrayFirstNull);
                        arrayPerson[indexArrayFirstNull].setName(nameAdd);
                        break;
                    }
                }
                break;
            }
        }

        //enter home's phone(not necessarily)
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want enter home's phone this person?  Yes/No");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                Scanner scan = new Scanner(System.in);                                       // зачем создавать новый сканер??? Если не создовать, то строке автоматически присваиваеться пустая строка.
                System.out.println("Enter home's phone this person in format 777-44-44");
                String homePhoneAdd = scan.nextLine();
                result = homePhoneAdd.matches("^\\d{3}\\-\\d{2}\\-\\d{2}${7}");
                if (result) {
                    System.out.println("Phone's number is valid :)");
                    arrayPerson[indexArrayFirstNull].setHomePhone(homePhoneAdd);
                    break;
                } else {
                    System.err.println("Phone's number is not valid :( ");
                }
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }

        //enter work's phone(not necessarily)
        while (true) {
            boolean flag = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want enter work's phone this person?  Yes/No");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter home's phone this person in format 777-44-44 or 066-777-66-55");//
                String workPhoneAdd = scan.nextLine();
                result = workPhoneAdd.matches("^\\d{3}\\-\\d{2}\\-\\d{2}${7}");
                if (result) {
                    System.out.println("Phone's number is valid :)");
                    arrayPerson[indexArrayFirstNull].setWorkPhone(workPhoneAdd);
                    flag = true;
                    break;
                }
                result = workPhoneAdd.matches("^0\\d{2}\\-\\d{3}\\-\\d{2}-\\d{2}${10}");
                if (result) {
                    System.out.println("Phone's number is valid :)");
                    arrayPerson[indexArrayFirstNull].setWorkPhone(workPhoneAdd);
                    flag = true;
                    break;
                } else {
                    System.err.println("Phone's number is not valid :( ");
                }
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
            if (flag) {
                break;
            }
        }

        //enter mobil phone(necessarily!!!)
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter mobil phone this person in format 066-999-88-77");
            String mobilPhoneAdd = scanner.nextLine();
            result = mobilPhoneAdd.matches("^0\\d{2}\\-\\d{3}\\-\\d{2}-\\d{2}${10}");
            if (result) {
                System.out.println("Phone's number is valid :)");
                arrayPerson[indexArrayFirstNull].setMobilPhone(mobilPhoneAdd);
                System.out.println(arrayPerson[indexArrayFirstNull]);
                break;
            } else {
                System.err.println("Phone's number is not valid :( ");
            }
        }

        //enter other data(not necessarily)
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want enter other data for this person?  Yes/No");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter other data this person:");
                String homePhoneAdd = scanner.nextLine();
                arrayPerson[indexArrayFirstNull].setHomePhone(homePhoneAdd);
                break;
            }
        }
    }

    //delete person
    public void deletePerson(int index) {
        System.out.println("Person "+ arrayPerson[index].getName()+" deleter!!!");

        arrayPerson[index].setName(null);
        arrayPerson[index].setHomePhone(null);
        arrayPerson[index].setWorkPhone(null);
        arrayPerson[index].setMobilPhone(null);
        arrayPerson[index].setOtherData(null);
//        arrayPerson[index] = null;

        System.out.println("Name = " + arrayPerson[index].getName());               //test
    }

    //search(поиск) person to name
    public int searchPerson() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name person");
            String nameScan = scanner.nextLine();
            nameScan = nameScan.toLowerCase();
            char[] searchChar = nameScan.toCharArray();
            for (int i = 0; i < arrayPerson.length; i++) {
                if (arrayPerson[i].getName() == null) {
                    System.err.println("This person not be!!!");
                    break;
                }
                String nameArray = arrayPerson[i].getName().toLowerCase();

                char[] arrayChar = nameArray.toCharArray();
                for (int j = 0; j < searchChar.length; j++) {
                    if (searchChar[j] != arrayChar[j]) {
                        break;
                    } else if (searchChar[j] == arrayChar[j] && j == searchChar.length - 1) {
                        System.out.println(arrayPerson[i].toString());
                        return i;
                    }
                }
            }
            System.out.println("Do you want go up in menu?");
            String output = scanner.next();
            if (output.equalsIgnoreCase("no")) {

            } else if (output.equalsIgnoreCase("yes")) {
                return 5000;
            } else {
                System.err.println("You enter not correct data!!!");
            }
        }
    }

    public void printPersons() {
        for (int i = 0; i < arrayPerson.length; i++) {
            if (arrayPerson[i].getName() != null) {
                System.out.println(arrayPerson[i].getName() + "\t" + "Home phone:" + arrayPerson[i].getHomePhone() + "\t" + "Work phone:" + arrayPerson[i].getWorkPhone() + "\t" + "Mobil phone" + arrayPerson[i].getMobilPhone() + "\t" + "[" + arrayPerson[i].getOtherData() + "]");
            }
        }
    }

    @Override
    public String toString() {
        return "MethodBookPhone{" +
                "arrayPerson=" + Arrays.toString(arrayPerson) +
                '}';
    }
}



package com.Home.test4.first;

import org.w3c.dom.ls.LSOutput;

public class RunBookPhone {
    //Создайте приложение «Телефонная книга». Необходимо
    //хранить данные об абоненте (ФИО, домашний телефон,
    //рабочий телефон, мобильный телефон, дополнительная
    //информация о контакте) внутри соответствующего класса.
    //Наполните класс переменными, методами, конструкторами.
    //Предоставьте пользователю возможность добавлять
    //новых абонентов, удалять абонентов, искать абонентов
    //по ФИО, показывать всех абонентов.
    public static void main(String[] args) {
        MenuBookPhone menuBookPhone = new MenuBookPhone();
        //Person person = new Person();
        MethodBookPhone methodBookPhone = new MethodBookPhone();


        while (true) {
            menuBookPhone.menu();

            if (menuBookPhone.answerMenu == 1) {
                methodBookPhone.addNewContact();
            } else if (menuBookPhone.answerMenu == 2) {
                methodBookPhone.deletePerson(methodBookPhone.searchPerson());
            } else if (menuBookPhone.answerMenu == 3) {
                methodBookPhone.searchPerson();
            } else if (menuBookPhone.answerMenu == 4) {
                methodBookPhone.printPersons();
            } else if (menuBookPhone.answerMenu == 5) {
                break;
            }else if(menuBookPhone.answerMenu == 6){
                System.out.println(methodBookPhone.toString());
            }
        }
    }
}

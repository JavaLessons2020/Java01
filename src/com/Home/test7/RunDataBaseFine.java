package com.Home.test7;


public class RunDataBaseFine {
    //1. Полная распечатка базы данных.
    //2. Распечатка данных по конкретному коду.
    //3. Распечатка данных по конкретному типу штрафа.
    //4. Распечатка данных по конкретному городу.
    //5. Добавление нового человека с информацией о нем.
    //6. Добавление новых штрафов для уже существующей записи.
    //7. Удаление штрафа.
    //8. Замена информации о человеке и его штрафах.
    public static void main(String[] args) {
        LogicDataBaseFine logicDataBaseFine = new LogicDataBaseFine();
        logicDataBaseFine.workDataBase();
    }
}

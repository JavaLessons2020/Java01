package com.company.Lesson28.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {
    public static void countStream(String nameFile) throws IOException {
        //считывание файла
        File file = new File(nameFile);
        byte[] bytes = new byte[(int)file.length()];
        FileInputStream fis = new FileInputStream(file);
        fis.read(bytes);
        fis.close();

        //очистка массива
        String[] valueStr = new String(bytes).trim().split("\\s+");

        //создание массива чисел
        int[] arr = new int[valueStr.length];
        for(int i=0; i<valueStr.length;i++){
            arr[i] = Integer.parseInt(valueStr[i]);
        }

        //выведение массива на экран и подсчет элементов массива
        int count1 = 0;
        for (int o : arr) {
            System.out.println(o);
            count1++;
        }

        // Сумма элементов массива
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма чисел массива: " + total);

        // Вывод четных элементов массива на экран
        System.out.print("Четные элементы массива: ");
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
                count2++;
            }
        }
        //подсчет процентной величины
        float Percent = (float)count2 * 100 / count1;

        System.out.printf("\nВсего элементов: %d, из них четных: %d (%.2f%%)", count1, count2, Percent);
    }
}

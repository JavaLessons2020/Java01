package com.company.Lesson4;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		/**
		 * Использование класса Math для генерации чисел
		 */
		double numberDouble = Math.random(); //генерирует случайного числа в диапазоне от 0.0 до 1.0.
		System.out.println("double = " + numberDouble);
		
		int numberInt = 10 + (int) (Math.random() * 11); // диапазон от 10 до 20 включительно
		System.out.println("int (от 0 до 10) = " + numberInt);
		
		/**
		 * Использование класса Random для генерации чисел
		 */
		Random random = new Random();
		// random.nextInt(); - возвращает следующее случайное значение типа int
		// random.nextDouble(); - возвращает следующее случайное значение типа double
		// random.nextBoolean(); - возвращает следующее случайное значение типа boolean
		
		int generatedNumber = random.nextInt(10); // генерируем число 0 до 9
		System.out.println("класс Random (от 0 до 9) = " + generatedNumber);
		
		generatedNumber += 100; // увеличиваем значение на 100 (диапазон стал от 100 до 109)
		System.out.println("класс Random (от 100 до 109) = " + generatedNumber);
	}
}

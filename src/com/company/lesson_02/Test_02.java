package com.company.lesson_02;

/*
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_02 {
    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число: ");
        int n = Integer.parseInt(bf.readLine());

        System.out.print("Я буду зарабативать $"+ n +" в час");


    }
}

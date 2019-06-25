/*
package com.company.Lesson_25_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

*/
/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*//*

public class Test_25_03 {
    public static void main(String[] args) {

    }

    private static String[] array() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите слово или цифру : ");
            arr[i] = bf.readLine();
        }
        return arr;
    }

    private static void sort(String[] arr) {
        String [] newarr = arr;
        int a = 0;
        int a1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isNumber(arr[i])) {
                a++;
                for (int j = 0; j<arr.length; i++) {
                    if () {
                        if () {
                        }
                    }
                }

            } else {
                for (int k = 0; k<arr.length; k++) {
                    if () {
                        if () {

                        }
                    }
                }

            }
        }
    }


    private static boolean isNumber(String a) {
        try {
            int i = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }

}
*/
//TODO
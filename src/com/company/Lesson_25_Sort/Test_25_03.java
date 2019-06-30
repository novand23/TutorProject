package com.company.Lesson_25_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
*/
public class Test_25_03 {
    public static void main(String[] args) throws IOException {
        String[] arr = sort(array());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static String[] array() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите слово или цифру : ");
            arr[i] = bf.readLine();
        }
        return arr;
    }

    private static String[] sort(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (isNumber(arr[i])) {
                for (int j = 0; j < arr.length; j++) {
                    if (isNumber(arr[j])) {
                        if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[i])) {
                            String k = arr[j];
                            arr[j] = arr[i];
                            arr[i] = k;
                        }
                    }
                }

            } else {
                for (int k = 0; k < arr.length; k++) {
                    if (!isNumber(arr[k])) {
                        if (isGreaterThen(arr[i], arr[k])) {
                            String w = arr[k];
                            arr[k] = arr[i];
                            arr[i] = w;
                        }
                    }
                }
            }

        }


        return arr;
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
        return a.compareTo(b) < 0;
    }

}

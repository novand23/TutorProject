package com.company.home_work.HW_Lesson_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Удвой слова
1. Введи с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.

Пример:
краб
лось
рак

Выходные данные:
краб краб
лось лось
рак рак
*/
public class HW_15_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter text: ");
            list.add(bf.readLine());
        }
        list = doubleValues(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    private static List<String> doubleValues(List<String> a) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            list1.add(a.get(i)+" "+a.get(i));

        }
        return list1;
    }
}
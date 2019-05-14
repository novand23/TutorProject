package com.company.Lesson_16;
/*  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Enter text: ");
            String a = bf.readLine();
            if (a.isEmpty()) break;
            list.add(a);
        }
        List<String> list1 = doubleValues(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        List<String> list2 = triplingValues(list);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }

    private static List<String> doubleValues(List<String> a) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() % 2 == 0) {
                list1.add(a.get(i) + " " + a.get(i));
            }
        }
        return list1;
    }
    private static List<String> triplingValues(List<String> a) {
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() % 2 != 0) {
                list2.add(a.get(i) + " " + a.get(i)+ " " + a.get(i));
            }
        }
        return list2;
    }
}
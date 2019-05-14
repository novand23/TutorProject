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
    }
    private static List<String> doubleValues(List<String> a) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).length() ) {

            }
        }
        }
        return list1;

}
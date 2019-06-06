package com.company.Lesson_21_Collection_2;
/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_21_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите город: ");
        String a = bf.readLine();
        System.out.println("В городе живут: ");
        name(stringStringHashMap(), a);

    }

    private static HashMap<String, String> stringStringHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Ивановы", "Москва");
        hashMap.put("Петровы", "Киев");
        hashMap.put("Абрамовичи", "Лондон");
        hashMap.put("Кроты", "Москва");
        hashMap.put("Улусы", "Лондон");
        return hashMap;
    }

    private static void name(Map<String, String> map, String a) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> text = iterator.next();
            if (text.getValue().equals(a)) {
                System.out.println(text.getKey());
            }
        }
    }
}

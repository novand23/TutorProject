package com.company.Lesson_20_Collection_1;
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
  map.put("Sim1", "Simn");
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_20_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведите имя: ");
        String a = bf.readLine();
        System.out.println("Ведите фамилию: ");
        String b = bf.readLine();
        System.out.println(name(takemap(), a));
        System.out.println(surname(takemap(), b));
    }

    private static Map<String, String> takemap() {
        Map<String, String> map = new HashMap<>();
        map.put("Sim1", "Simn");
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
        return map;
    }

    private static int name(Map<String, String> map, String a) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int quantity = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> text = iterator.next();
            if (text.getKey().equals(a)) {
                quantity++;
            }
        }
        return quantity;
    }

    private static int surname(Map<String, String> map, String a) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int quantity = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> text = iterator.next();
            if (text.getValue().equals(a)) {
                quantity++;
            }
        }
        return quantity;
    }
}

package com.company.Lesson_20_Collection_1;

/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 3 различные пары.
При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test_20_02 {
    public static void main(String[] args) {
        printKay(takeKay());


    }

    private static HashMap<String, String> takeKay() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Рустам", "Виола");
        hashMap.put("Вадик", "Нона");
        hashMap.put("Тарик", "Едик");
        return hashMap;

    }

    private static void printKay(HashMap<String, String> hashMap) {
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> text = iterator.next();
            System.out.println(text.getKey());
        }
    }

}
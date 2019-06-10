package com.company.Lesson_20_Collection_1;

import java.util.HashMap;
import java.util.Map;

/*
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
груша - фрукт
*/
public class Test_20_08 {
    public static void main (String[]args){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("арбуз", "ягода");
        hashMap.put("банан", "трава");
        hashMap.put("вишня", "ягода");
        hashMap.put("груша", "фрукт");

        for (Map.Entry<String,String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}

package com.company.Lesson_22_Exception_01;

import java.util.HashMap;
import java.util.Map;

/* Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
Map<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/
public class Test_22_06_Map {
    public static void main(String[] args) {
        try {
            Map<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}

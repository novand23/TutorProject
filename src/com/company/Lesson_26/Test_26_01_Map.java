package com.company.Lesson_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/
public class Test_26_01_Map {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new_map(list());
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> text = iterator.next();
            System.out.println(text.getKey() + " - " + text.getValue());
        }


    }

    private static List list() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку: ");
            words.add(bf.readLine());

        }
        return words;
    }

    private static Map<String, Integer> new_map(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); ) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    map.put(list.get(i), count);
                    j++;
                } else {
                    j++;
                }
            }
        }
        return map;
    }
}


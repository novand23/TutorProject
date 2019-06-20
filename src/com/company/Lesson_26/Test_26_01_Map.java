package com.company.Lesson_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 5 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/
public class Test_26_01_Map {
    public static void main(String[] args) {
    }

    private static List arrayList() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            words.add(bf.readLine());

        }
        return words;
    }
    private static Map<String, Integer> count (List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> map1: map.entrySet()){

        }


    }
}

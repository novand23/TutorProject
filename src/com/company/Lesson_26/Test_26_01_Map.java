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
        System.out.println(count(list()));

    }

    private static List list() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            words.add(bf.readLine());

        }
        return words;
    }

    private static int count(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        /*Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();*/
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() ;) {
                if (list.get(i).equals(list.get(j))) {
                    a++;

                    j++;
                } else {
                    j++;
                }
            }
        }
        return a;
    }
}
//TODO

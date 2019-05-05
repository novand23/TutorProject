package com.company.home_work.HW_Lesson_14;

/* Слияние списков.
 Создать первый список чисел и заполнить его используя Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);
 Создать второй список чисел и заполнить его используя Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);
 Создать третий список чисел и заполнить его значениями из первого и второго списков
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW_14_03 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list1, 5, 6, 11, 3, 15, 7, 8);
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);
        List<Integer> list = sum(list1, list2);
        System.out.println(list);
    }

    private static List<Integer> sum(List<Integer> a, List<Integer> b) {
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            l.add(a.get(i));
        }
        for (int i = 0; i < b.size(); i++) {
            l.add(b.get(i));
        }
        return l;
    }
}

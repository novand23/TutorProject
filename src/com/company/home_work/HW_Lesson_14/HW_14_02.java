package com.company.home_work.HW_Lesson_14;

/* Разделение списка на два — чётных и нечётных чисел
 Создать список чисел и заполнить его с консоли
 Разбить список на два других:
 - в первый список сохранять чётные числа
 - во второй список сохранять нечётные числа
 Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HW_14_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> bosslist = new ArrayList<>();
        int i = 0;
        while (i < 10) {
            System.out.println("Enter number: ");
            bosslist.add(Integer.parseInt(bf.readLine()));
            i++;
        }
        List<Integer> evenlist = even(bosslist);
        for (int u = 0; u < evenlist.size(); u++) {
            System.out.print(evenlist.get(u));
        }

        System.out.println();

        List<Integer> oddlist = odd(bosslist);
        for (int k = 0; k < oddlist.size(); k++) {
            System.out.print(oddlist.get(k));
        }
    }

    private static List<Integer> even(List<Integer> a) {
        List<Integer> evenlist = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                evenlist.add(a.get(i));
            }
        }
        return evenlist;
    }

    private static List<Integer> odd(List<Integer> a) {
        List<Integer> oddlist = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 != 0) {
                oddlist.add(a.get(i));
            }
        }
        return oddlist;
    }
}

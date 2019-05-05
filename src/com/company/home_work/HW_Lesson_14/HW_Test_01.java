package com.company.home_work.HW_Lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Создать список чисел и заполнить его с консоли следующим образом:
 чётные числа добавляють в конец списка, нечётные — в начало. */

public class HW_Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while (true) {
            System.out.println("Enter number: ");
            int a = Integer.parseInt(bf.readLine());
            if (a % 2 != 0) {
                list.add(0, a);
                for (int i1 = 0; i1 < list.size(); i1++) {
                    System.out.println(list.get(i1));
                }
            } else {
                list.add(a);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    System.out.println(list.get(i2));
                }
            }
        }
    }
}

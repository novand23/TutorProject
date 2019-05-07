package com.company.Lesson_15;
/* Три массива
1. Введи с клавиатуры 8 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter number: ");
            list.add(Integer.parseInt(bf.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list1.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 != 0 & list.get(i) % 2 != 0) {
                list3.add(i);
            }
        }
        System.out.println(printList(list1));
        System.out.println(printList(list2));
        System.out.println(printList(list3));
    }

    private static List<Integer> printList(List a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        return a;
    }

}

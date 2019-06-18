package com.company.Lesson_25_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Ввести с клавиатуры 5 чисел и отсортировать их бабл сортом.
 */
public class Test_25_01_Buble {
    private static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(bf.readLine()));
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int a = list.get(j);
                    list.get(j) = list.get(j + 1);
                    list.get(j+1) = a;

                }
            }
        }
    }
}

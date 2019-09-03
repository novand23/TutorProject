package com.company.Lesson_30;/*
package com.company.Lesson_30;
*/
/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test_30_HW_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b = new BufferedReader(new FileReader(bf.readLine()));
        List<Integer> list = new ArrayList<>();

        while (true) {
            String s = b.readLine();
            if (s == null) {
                break;
            } else {
                int number = Integer.parseInt(s);
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
        }

        sort(list);

        for (int i: list){
            System.out.println(i);

        }
    }

    private static void sort(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
}

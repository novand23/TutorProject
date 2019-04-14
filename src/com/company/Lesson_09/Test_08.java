package com.company.Lesson_09;

/*
 Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Найти минимальный элемент в массиве и вывести его в консоль.
*/

public class Test_08 {
    public static void main(String[] args) {

        int[] s = {1, 14, 2, 7, 2};

        int min = s[0];
        for (int i = 0; i < s.length; i++) {
            if (min > s[i]) {
                min = s[i];
            }

        }
        System.out.println(min);
    }
}

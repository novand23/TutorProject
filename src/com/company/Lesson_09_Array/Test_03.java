package com.company.Lesson_09_Array;

// Заполнение массива из 10 чисел, числами от 10 до 19
public class Test_03 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int b = 0; b < a.length; b++) {
            a[b] = 10 + b;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

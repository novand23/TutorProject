package com.company.home_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на n чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на n/2 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class HW_Lesson_11 {
    public static void main(String[] args) throws IOException {

        int[] a1 = array1();
        int[] a2 = new int[a1.length / 2];
        int[] a3 = new int[(a1.length + 1) / 2];
        f1(a1, a2);
        System.out.println();
        f2(a1, a3);
    }

    public static int[] array1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число ячеек масива: ");
        int n = Integer.parseInt(bf.readLine());
        int[] s1 = new int[n];
        for (int i = 0; i < s1.length; i++) {
            System.out.println("Введите число: ");
            s1[i] = Integer.parseInt(bf.readLine());
        }
        return s1;
    }


    public static void f1(int[] a, int[] b) {
        for (int i = 0; i < a.length / 2; i++) {
            b[i] = a[i];
            System.out.println(b[i]);
        }
    }

    public static void f2(int[] a, int[] b) {
        if ((a.length % 2) == 0) {
            for (int i = 0; i < a.length / 2; i++) {
                b[i] = a[i + a.length / 2];
            }
        } else {
            for (int i = 0; i < (a.length + 1) / 2; i++) {
                b[i] = a[i + a.length / 2];
                System.out.println(b[i]);

            }
        }
    }
}

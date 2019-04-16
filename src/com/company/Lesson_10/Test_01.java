package com.company.Lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль*/


public class Test_01 {
    public static void main(String[] args) throws IOException {
        System.out.println(max(nitializeArray()));

    }

    public static int[] nitializeArray() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ведите число: ");
            a[i] = Integer.parseInt(bf.readLine());
        }
        return a;
    }

    public static int max(int[] array) {


        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число: ");

        return max;
    }
}



package com.company.Lesson_09_Array;

// Ввести 5 чисел с клавиатуры и записать их в массив
// Вывести содержимое массива в консоль

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] mus = new int[5];
        for (int a = 0; a < mus.length; a++) {
            System.out.println("Enter number: ");
            mus[a] = Integer.parseInt(bf.readLine());
        }
        System.out.println();
        for (int b = 0; b<mus.length; b++){
            System.out.println(mus[b]);
        }
    }
}

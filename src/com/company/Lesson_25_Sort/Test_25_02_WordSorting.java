package com.company.Lesson_25_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_25_02_WordSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            arr[i] = bf.readLine();
        }
    }


    private static void sort (String[] s) {

    }
}

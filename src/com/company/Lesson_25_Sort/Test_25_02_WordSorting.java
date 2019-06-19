package com.company.Lesson_25_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_25_02_WordSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите строку: ");
            arr[i] = bf.readLine();
        }
       sort(arr);
    }

    private static void sort(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int a = i; a < words.length; a++)
                if (words[a].compareTo(words[i]) < 0) {
                    String k = words[a];
                    words[a] = words[i];
                    words[i] = k;
                }
            System.out.println(words[i]);
        }

    }
}

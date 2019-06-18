package com.company.Lesson_25_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Ввести с клавиатуры 5 чисел и отсортировать их бабл сортом.
 */
public class Test_25_01_Buble {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            arr[i] = Integer.parseInt(bf.readLine());
        }
        bubbleSort(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

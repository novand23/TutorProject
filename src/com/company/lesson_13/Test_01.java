package com.company.lesson_13;

/*
 * Missing number
 * You are given a array of n-1 integers and these integers are in the range of 0 to n.
 * There are no duplicates in array. One of the integers is missing in the array. Write an efficient code to find the missing integer.
 * Example:
 * I/P    [0, 1, 2, 4, ,6, 3, 7, 8]
 * O/P    5
 */
public class Test_01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 4};
        sort(arr);
        System.out.println();
        missing_number(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] missing_number(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[0] == 0) {
                if (a[i + 1] == a[i] + 1) {
                } else {
                    System.out.println(a[i] + 1);
                }
            } else {
                a[i] = 0;
                System.out.println(a[i]);
            }
        }
        return a;
    }
}
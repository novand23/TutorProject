package com.company.lesson_13;

 /* Missing number
 * You are given a array of n-1 integers and these integers are in the range of 0 to n.
 * There are no duplicates in array. One of the integers is missing in the array. Write an efficient code to find the missing integer.
 * Example:
 * I/P    [0, 1, 2, 4, ,6, 3, 7, 8]
 *\ O/P    5
*/


import java.util.Arrays;

public class Test_01 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 2};
        /*sort(arr);*/
        System.out.println(missingNumber1(arr));

    }

 /*   public static void sort(int[] arr) {
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

    public static void missing_number(int[] a) {
        int a1 = a[0];
        int a2 = a[1];
        for (int i = 0; i<a.length-1; i++){
            if (a1+1 == a2){
                System.out.println(a);
            } else if (a1+1!=a2){
                System.out.println(a[i+1]);
            }
        }

    }*/
 private static int missingNumber1(int[] arr){ // O(n^2)
     if(arr.length == 0){
         return 0;
     }

     Arrays.sort(arr);
     for (int i = 0; i < arr.length - 1; i++) {
         if(arr[i] != arr[i+1]-1){
             return arr[i+1]-1;
         }
     }

     if(arr[0] != 0) {
         return 0;
     } else {
         return arr.length;
     }
 }
}

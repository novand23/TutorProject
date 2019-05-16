package com.company.Lesson_17;

import java.util.Arrays;

// Задача по алгоритмам.
// Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
// Пример ввода:
// {123456789, 65475264, 836133896, 836133896, 746254373, 1000000000,
//  542627588, 1000000000, 444088605, 65475264, 746254373, 542627588, 444088605}
// Пример вывода:
// 123456789

public class Test_17_01 {
    public static void main (String[] args) {
        int[] arr = {2,8,4,4,8};
        System.out.println(no_duplicate(arr));


    }

    private static int no_duplicate(int[] a) {
        if (a.length == 0) {
            return -1;
        }

        for(int i = 1; i < a.length; i++) {
            for(int j = i; j >= 1; j--) {
                int t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
            }
        }
        for (int i = 0; i < a.length; i=+2) {
            if (a[i] != a[i + 1]) {
                return a[i];
            }
        }
        return -1;
    }
}



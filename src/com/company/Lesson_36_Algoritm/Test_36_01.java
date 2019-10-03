package com.company.Lesson_36_Algoritm;


import java.util.ArrayList;
import java.util.List;

public class Test_36_01 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 1, 4, 3, 6};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; ) {
            for (int k = 0; k < array.length; ) {
                if (i == k) {
                    k++;
                } else if (i < array.length) {
                    if (array[i] == array[k]) {
                        i++;
                        k = 0;
                    } else if (k == array.length - 1) {
                        list.add(array[i]);
                        i++;
                        k = 0;
                    } else {
                        k++;
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

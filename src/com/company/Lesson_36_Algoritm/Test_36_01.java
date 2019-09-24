package com.company.Lesson_36_Algoritm;


import java.util.ArrayList;
import java.util.List;

public class Test_36_01 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 1, 4, 3, 6};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int k = i+1; k < array.length; k++)
                if (array[i] == array[k]) {
                    i++;
                    k=0;
                } else {
                    if (array[i] != array[]) {
                        list.add(array[i]);
                    }
                    k++;
                }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

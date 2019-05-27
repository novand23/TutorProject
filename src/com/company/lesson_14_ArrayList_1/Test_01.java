package com.company.lesson_14_ArrayList_1;

import java.util.ArrayList;
import java.util.List;

public class Test_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // Integer[] list = new Integer[50];
        System.out.println(list.size());        // list.length
        list.add(5);                            // list[0] = 5;
        System.out.println(list.get(0));        // sout -> list[0]
        list.add(7);                            // list[1] = 7;
        list.add(0, 20);           // [0] = 20; [1] = 5; [2] = 7
        list.set(2, 10);                         // [2] = 10;


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
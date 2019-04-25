package com.company.lesson_14;
// Создать список из целых чисел и заполнить его с консоли
// Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter number: ");
        list.add(Integer.parseInt(bf.readLine()));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Enter number: ");
            list.add(Integer.parseInt(bf.readLine()));

        }
    }
}

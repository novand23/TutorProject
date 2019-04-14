package com.company.home_work.HW_Lesson_05;
/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1: ");
        int m = Integer.parseInt(bf.readLine());
        System.out.println();
        System.out.println("Enter number 2: ");
        int n = Integer.parseInt(bf.readLine());
        System.out.println();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}

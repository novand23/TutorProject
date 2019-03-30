package com.company.home_work.HW_Lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Введите с клавиатуры три целых числа.
Выведите их на экран в порядке возрастания, используя if/else.
*/
public class HW_01 {
    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ведите число 1: ");
        int n1 = Integer.parseInt(bf.readLine());
        System.out.println("Ведите число 2: ");
        int n2 = Integer.parseInt(bf.readLine());
        System.out.println("Ведите число 3: ");
        int n3 = Integer.parseInt(bf.readLine());

        System.out.println();

        if (n1<n2 && n1<n3){
            System.out.println(n1);
        } else if (n2<n1 && n2<n3){
            System.out.println(n2);
        } else if (n3<n1 && n3<n2){
            System.out.println(n3);
        }

        if (n1>n2 && n1<n3 || n1>n3 && n1<n2){
            System.out.println(n1);
        } else if (n2>n1 && n2<n3 || n2>n3 && n2<n1){
            System.out.println(n2);
        } else if (n3>n1 && n3<n2 || n3>n2 && n3<n1){
            System.out.println(n3);
        }

        if (n1>n2 && n1>n3){
            System.out.println(n1);
        } else if (n2>n1 && n2>n3){
            System.out.println(n2);
        } else if (n3>n1 && n3>n2){
            System.out.println(n3);
        }
    }
}

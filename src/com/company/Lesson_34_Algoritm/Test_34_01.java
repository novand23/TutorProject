package com.company.Lesson_34_Algoritm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/
public class Test_34_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        System.out.println(numberMod(a,b));

    }

    public static int numberMod(int a, int b) {
        if (a > b) {
            while (b != 0) {
                int c = a % b;
                a = b;
                b = c;
            }
        }
        return b;
    }
}

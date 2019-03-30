package com.company.home_work.HW_Lesson_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_04 {
    public static void main(String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number: ");
        int number1 = Integer.parseInt(bf.readLine());
        System.out.println("Enter second number: ");
        int number2 = Integer.parseInt(bf.readLine());
        System.out.println("Enter third number: ");
        int number3 = Integer.parseInt(bf.readLine());

        System.out.println();

        System.out.print("Среднее число = ");
        if (number1>number2 && number1<number3 || number1>number3 && number1<number2) {
            System.out.println(number1);
        } else if (number2>number3 && number2<number1 || number2>number1 && number2<number3){
            System.out.println(number2);
        }else if (number3>number1 && number3<number2 || number3>number2 && number3<number1) {
            System.out.println(number3);
        }
    }
}

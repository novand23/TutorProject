package com.company.lesson_02;

/*
    Ввести с клавиатуры два числа, вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_04 {
    public static void main (String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number: ");
        int number1 = Integer.parseInt(buf.readLine());
        System.out.println("Enter second number: ");
        int number2 = Integer.parseInt(buf.readLine());

        System.out.print("Min number = ");
        if (number1<number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }


    }
}

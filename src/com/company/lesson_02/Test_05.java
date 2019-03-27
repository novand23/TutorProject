package com.company.lesson_02;

/*
    Ввести с клавиатуры три числа, вывести на экран максимальное из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_05 {
    public static void main (String [] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number: ");
        int number1 = Integer.parseInt(buff.readLine());
        System.out.println("Enter second number: ");
        int number2 = Integer.parseInt(buff.readLine());
        System.out.println("Enter third number: ");
        int number3 = Integer.parseInt(buff.readLine());

        System.out.print("Max number = ");

        if (number1>number2 && number1>number3) {
            System.out.println(number1);

        }else if (number2>number1 && number2>number3) {
            System.out.println(number2);

        }else if (number3>number1 && number3>number2) {
            System.out.println(number3);
        }

    }
}

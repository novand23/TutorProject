package com.company.home_work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_05 {
/*
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
Пример:
Коля получает 3000 через 5 лет.
*/

        public static void main(String[]args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter name: ");
            String name = bf.readLine();

            System.out.println("Enter first number: ");
            int number1 = Integer.parseInt(bf.readLine());

            System.out.println("Enter second number: ");
            int number2 = Integer.parseInt(bf.readLine());

            System.out.println(name+" получает "+number1+" через "+number2+" лет ");

        }
    }


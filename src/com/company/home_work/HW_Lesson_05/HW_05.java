package com.company.home_work.HW_Lesson_05;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int d = 1;
        while (d > 0) {
            System.out.println("Enter number: ");
            int n1 = Integer.parseInt(bf.readLine());

            if (n1 != -1) {

                System.out.println("Sum: ");
                System.out.println(addition(n1));
            } else {

                System.out.println("Sum: ");
                System.out.println(addition(n1)); break;
            }
            d++;
        }

    }

    public static int addition(int n1) {
        return n1;
    }
}

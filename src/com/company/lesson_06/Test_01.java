package com.company.lesson_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 1) Пользователь вводит число от 1 до 4
 * 2) Если число не входит в диапазон от 1 до 4 - выводим сообщение "Неверное число!"
 * 3) Иначе вызываем соответсвующий метод:
 *  - если пользователь ввел 1, то отрабатывает метод subt, который должен вычесть второе число из первого, числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 2, то отрабатывает метод sum, который должен найти сумму двух чисел, которые пользователь должен ввести дополнительно
 *  - если пользователь ввел 3, то отрабатывает метод multy, который должен  умножить первое число на второе, числа пользователь должен ввести дополнительно
 *  - если пользователь ввел 4, то отрабатывает метод div, который должен поделить два числа, которые пользователь должен ввести дополнительно
 * 4) После того, как один из методов отработал, выводим пользователю результат
 */
public class Test_01 {

    public static int sub (int number1, int number2) {
        return number1 - number2;
    }
    public static int sum (int number3, int number4){
        return number3+number4;
    }
    public static int multy (int number5, int number6){
        return number5*number6;
    }
    public static int div (int number7, int number8){
        return number7/number8;
    }
    public static void main (String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ведите число от 1 до 4: ");
        int number = Integer.parseInt(bf.readLine());

        if (number > 4 || number < 1) {
            System.out.println("Неверное число!");

        } else if (number == 1) {
            System.out.println("Ведите дополнительное первое число: ");
            int number1 = Integer.parseInt(bf.readLine());
            System.out.println("Ведите дополнительное второе число: ");
            int number2 = Integer.parseInt(bf.readLine());
            System.out.println(sub(number1,number2));

        } else if (number == 2) {
            System.out.println("Ведите дополнительное первое число: ");
            int number3 = Integer.parseInt(bf.readLine());
            System.out.println("Ведите дополнительное второе число: ");
            int number4 = Integer.parseInt(bf.readLine());
            System.out.println(sum(number3,number4));

        } else if (number == 3) {
            System.out.println("Ведите дополнительное первое число: ");
            int number5 = Integer.parseInt(bf.readLine());
            System.out.println("Ведите дополнительное второе число: ");
            int number6 = Integer.parseInt(bf.readLine());
            System.out.println(multy(number5,number6));

        } else if (number == 4) {
            System.out.println("Ведите дополнительное первое число: ");
            int number7 = Integer.parseInt(bf.readLine());
            System.out.println("Ведите дополнительное второе число: ");
            int number8 = Integer.parseInt(bf.readLine());
            System.out.println(div(number7,number8));
        }


    }
}

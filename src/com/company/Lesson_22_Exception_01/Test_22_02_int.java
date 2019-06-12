package com.company.Lesson_22_Exception_01;
/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/
public class Test_22_02_int {
    public static void main (String[]args){
        try {
            int a = 42/0;
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
}

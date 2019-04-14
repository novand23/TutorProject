package com.company.home_work.HW_Lesson_05;

/*
Вывести на экран квадрат 10х10 из букв S используя цикл while.
Буквы в одной строке не разделять.
*/
public class HW_02 {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        while (i < 10) {
            while (j < 10) {
                System.out.print("S");
                j++;
            }
            i++;
            j = 0;
            System.out.println();

        }

    }
}

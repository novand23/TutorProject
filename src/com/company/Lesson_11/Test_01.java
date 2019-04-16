package com.company.Lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 5 чисел.
2. Ввести с клавиатуры 5 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Test_01 {
    public static void main (String[]args) throws IOException {

        int [] ar = array();
        printArray(ar);
    }

    public static int [] array () throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int [] a = new int[5];
        for (int i = 0; i<a.length; i++){
            System.out.println("Ведите число: ");
            a[i] = Integer.parseInt(bf.readLine());
        }

        return a;
    }
    public static void printArray( int [] array) {
        for (int i = array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }
}

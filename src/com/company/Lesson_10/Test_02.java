package com.company.Lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {

        String [] ar = initializeArray();
        printArray(ar);

    }

    public static String[] initializeArray() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String[] s = new String[10];
        for (int i = 0; i < 8; i++) {
            System.out.println("Ведите строку: ");
            s[i] = bf.readLine();
        }
        return s;
    }

    public static void printArray(String[] array) {
        for (int i = array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        }
    }

}

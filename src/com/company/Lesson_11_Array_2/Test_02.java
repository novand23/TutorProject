package com.company.Lesson_11_Array_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {

        int[] a = array1();
    }

    public static int[] array1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] s1 = new int[10];
        for (int i = 0; i < s1.length; i++) {
            System.out.println("Введите число: ");
            s1[i] = Integer.parseInt(bf.readLine());
        }
        int[] s2 = new int[5];
        for (int i = 0; i < 5; i++) {
            s2[i] = s1[i];
        }

        int[] s3 = new int[5];
        for (int i = 0; i < 5; i++) {
            s3[i] = s1[i + 5];
            System.out.println(s3[i]);
        }
        return s1;
    }
}

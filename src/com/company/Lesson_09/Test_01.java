package com.company.Lesson_09;

/*
 Заполнение массива из 10 чисел, числами от 1 до 10
*/
public class Test_01 {
    public static void main(String[] args) {

        int a[] = new int[10];
        for (int b=0; b<a.length; b++){
            a [b] = b+1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}





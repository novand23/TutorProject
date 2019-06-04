package com.company.Lesson_09_Array;

// Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
// Посчитать сумму элементов массива и вывести её на экран.

public class Test_07 {
    public static void main (String []args){

        int [] s = {10,8,16,11,2};

        int sum = 0;
        for (int i=0; i<s.length; i++){
            sum=sum+s[i];
        }
        System.out.println(sum);
    }

}

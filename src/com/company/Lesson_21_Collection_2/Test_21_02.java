package com.company.Lesson_21_Collection_2;

/* Задача по алгоритмам. Фиббоначи
   Найти ряд Фиббоначи для 10
*/
public class Test_21_02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonachhi(i));
        }
    }

    private static int fibonachhi(int n){
        if (n<=0) {
            return 0;
        } else if(n == 1){
            return 1;
        } else if(n == 2){
            return 1;
        } else {
            return fibonachhi(n-1) + fibonachhi(n - 2);
        }


    }
}
//TODO
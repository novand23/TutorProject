package com.company.Lesson_07;
/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class Test_01 {
    public static void main(String[] args) {

        int s = 8;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(s);
            }
            System.out.println(s);
        }
    }
}


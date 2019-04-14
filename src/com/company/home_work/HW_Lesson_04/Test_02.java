package com.company.home_work.HW_Lesson_04;
/*
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/
        public class Test_02 {
            public static void main(String[] args) {

                for (int i = 2; i <= 100; i += 2) {
                    System.out.println(i);

                }

                for (int q = 1; q <= 100; q++) {
                    q = q + 1;
                    System.out.println(q);
                }

            }
        }

package com.company.Lesson_17_Data;

import java.util.Date;

// Вычислить разницу между двумя датами
public class Test_17_05 {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        Thread.sleep(3000);
        Date date1 = new Date();
        System.out.println(date);
        System.out.println(date1);

        System.out.println((date.getTime() - date1.getTime()));
    }
}

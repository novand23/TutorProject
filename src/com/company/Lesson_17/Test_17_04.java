package com.company.Lesson_17;
/* Получение текущей даты
Посчитать сколько лет прошло с 1970 года */


import java.util.Date;

public class Test_17_04 {
    public static void main (String[]args){
        Date date = new Date();

        long msDay = 24*60*60*1000;
        System.out.println(date.getTime()/msDay/365);

    }
}

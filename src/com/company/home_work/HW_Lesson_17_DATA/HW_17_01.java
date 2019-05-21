package com.company.home_work.HW_Lesson_17_DATA;

import java.util.Date;

// Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date.
public class HW_17_01 {
    public static void main (String[]args){
        Date date = new Date();
        Date date1 = new Date();
        date1.setYear(date.getYear());
        date1.setMonth(date.getMonth());
        date1.setDate(date.getDate());
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        System.out.println(date.getTime() - date1.getTime());
        System.out.println(date.getHours() + " часа " + date.getMinutes() + " минут " + date.getSeconds()+" секунд");
    }

}


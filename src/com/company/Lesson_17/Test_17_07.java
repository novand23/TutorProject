package com.company.Lesson_17;

// Посчитать сколько дней прошло с начала года. Используйте класс Date.

import java.util.Date;

public class Test_17_07 {
    public static void main (String [] args){
        Date date = new Date();
        Date date1 = new Date();
        date1.setYear(119);
        date1.setMonth(0);
        date1.setDate(1);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);

        System.out.println((date.getTime()-date1.getTime())/86400000);
        System.out.println(date1);

    }
}

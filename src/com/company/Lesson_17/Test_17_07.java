package com.company.Lesson_17;

// Посчитать сколько дней прошло с начала года. Используйте класс Date.

import java.util.Date;

public class Test_17_07 {
    public static void main (String [] args){
        Date date = new Date();
        Date date1 = new Date();


        System.out.println(date.getTime() - date1.setTime(49*365*24*60*60*1000));

    }
}

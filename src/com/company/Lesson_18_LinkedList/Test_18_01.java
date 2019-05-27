package com.company.Lesson_18_LinkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
*/
public class Test_18_01 {
    public static void main (String[]args){
        List<Object> list = new ArrayList<>();
        List<Object> list1 = new LinkedList<>();
        System.out.println(getTimeMsOfInsert(list));
        System.out.println(getTimeMsOfInsert(list1));
    }
    public static long  getTimeMsOfInsert(List list){
        Date dateS = new Date();
        insert(list);
        Date dateF = new Date();
        long time = dateF.getTime()-dateS.getTime();
        return time;

    }
    public static void insert (List list){
        int a = 1;
        for (int i = 0; i<10000;i++){
            list.add(0, a);
        }
    }
}

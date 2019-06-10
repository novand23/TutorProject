package com.company.Lesson_20_Collection_1;



import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/
public class Test_20_05 {
    public static void main (String[]args){
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        System.out.println(getTimeMsOfGet(addlist(arrayList)));
        System.out.println(getTimeMsOfGet(addlist(linkedList)));
    }

    public static List addlist (List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static List getList(List list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        Date date = new Date();
        getList(list);
        Date date1 = new Date();
        return date1.getTime() - date.getTime();
    }
}

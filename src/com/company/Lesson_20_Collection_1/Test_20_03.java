package com.company.Lesson_20_Collection_1;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 5 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test_20_03 {
    public static void main (String[]args){
        removeAllNumbersMoreThan10(setnum());

    }
    private static Set<Integer> setnum(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(9);
        set.add(54);
        set.add(90);
        set.add(8);
        return set;
    }
    private static void removeAllNumbersMoreThan10 (Set<Integer> set){
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            int a = it.next();
            if (a>10){
                it.remove();
            }
        }
    }
}

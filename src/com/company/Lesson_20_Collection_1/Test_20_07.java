package com.company.Lesson_20_Collection_1;

import java.util.HashSet;

/*
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 5 строк: арбуз, банан, вишня, груша, дыня.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/
public class Test_20_07 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("арбуз");
        hashSet.add("банан");
        hashSet.add("вишня");
        hashSet.add("груша");
        hashSet.add("дыня");

        for (String i : hashSet) {
            System.out.println(i);
        }
    }
}

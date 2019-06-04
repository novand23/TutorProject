package com.company.Lesson_20_Collection_1;

import java.util.*;

/*
 Вывод на экран элементов Set, List, Map используя итератор
*/
public class Test_20_01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("qwer");
        set.add("qwer");
        set.add("212w");
        set.add("dsfsdf2");
        set.add("sdfe2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }

        List<String> list = new ArrayList<>();
        list.add("ere");
        list.add("ere");
        list.add("dsfbfb");
        list.add("wedfe");
        list.add("gfbbgf");

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            String text = iterator1.next();
            System.out.println(text);
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("sdf", 1);
        map.put("sdf", 3);
        map.put("gbffdv", 5);
        map.put("fked", 2);
        map.put("eewwe", 2);

        Iterator<Map.Entry<String, Integer>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> text = iterator2.next();
            System.out.println(text.getValue() + "--" + text.getKey());
        }
    }
}

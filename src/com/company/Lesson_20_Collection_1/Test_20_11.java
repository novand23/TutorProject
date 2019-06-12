package com.company.Lesson_20_Collection_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");
*/
public class Test_20_11 {
    public static void main(String[] args) {
        Map<String,String> map = new_map();
        map(map);
        System.out.println(map);
    }

    private static Map<String, String> new_map() {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;
    }

    private static void map(Map<String, String> map) {
        for (Map.Entry<String, String> map1 : map.entrySet()) {
            String name = map1.getValue();
            remove(new_map(), name);

        }

    }

    private static void remove(Map<String, String> map, String s) {
        Map<String, String> copymap = new HashMap<>(map);
        for (Map.Entry<String, String> map1 : copymap.entrySet()) {
            if (map1.getValue().equals(s)) {
                map.remove(map1.getKey());
            }
        }
    }


}
package com.company.Lesson_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
лира
лоза
роза

Выходные данные:
лира
лоза
лоза
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter text: ");
            list.add(bf.readLine());

        }
        list = fix(list);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static List<String> fix(List<String> a) {
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).contains("р") && a.get(i).contains("л")) {
                list1.add(a.get(i));
            } else if (a.get(i).contains("р")) {

            } else if (a.get(i).contains("л")) {
                list1.add(a.get(i));
                list1.add(a.get(i));
            } else {
                list1.add(a.get(i));

            }
        }
        return list1;
    }
}



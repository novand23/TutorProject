package com.company.home_work.HW_Lesson_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class HW_14_04 {
    public static void main (String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        for (int i = 0; i<3; i++) {
            System.out.println("Enter text: ");
            list.add(bf.readLine());
        }
        int a = list.get(0).length();

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length()>a){
                a = list.get(i).length();
                System.out.println(list.get(i));
            } else if (list.get(i).length() == a){

            }
        }
    }
}

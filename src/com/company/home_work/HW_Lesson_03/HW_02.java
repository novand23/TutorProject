package com.company.home_work.HW_Lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1) Создать метод convert, который должен конвертировать гривны в доллары. В метод должен приходить один аргумент (к-во гривен). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/
public class HW_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ведите количество гривен, для конвертации: ");
        int n1 = Integer.parseInt(bf.readLine());
        System.out.print("Количество доларов = ");
        System.out.println(convert(n1));
        System.out.println();

        System.out.println("Ведите число для увеличения его на 10%: ");
        int n2 = Integer.parseInt(bf.readLine());
        System.out.println();
        System.out.println(percent(n2));
        System.out.println();

        System.out.println("Ведите строку: ");
        String str = bf.readLine();
        System.out.println();
        System.out.println(print(str));
    }

    public static float convert(float n1) {
        float n2 = 27.32F;
        return n1 / n2;
    }
    public static float percent (float n1) {
        float n2 = (float) (0.1 * n1);
        return n1 + n2;
    }
    public static String print (String s){
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        return s;
    }
}


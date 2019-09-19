package com.company.Lesson_35_OOP.Test_35_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
0. Создать метод print и перегрузить его для разных типов:
- print( Double value ), должен выводит на экран надпись "Это тип Double, значение " + value
- print( String value ), должен выводит на экран надпись "Это тип String, значение " + value
- print( short value ), должен выводит на экран надпись "Это тип short, значение " + value
- print( Integer value ), должен выводит на экран надпись "Это тип Integer, значение " + value
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/
public class Test_35_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        try {
            while (!s.equals("exit")) {
                if (s.contains(".")) {
                    print(Double.parseDouble(s));
                } else {
                    int num = Integer.parseInt(s);
                    if (num > 0 && num < 128) {
                        print(num);
                    } else {
                        short sh = Short.parseShort(s);
                        if (num >= 128) {
                            print(sh);
                        } else {
                            print(s);
                        }
                    }
                }
                s = bf.readLine();
            }
        } catch (NumberFormatException e){
        print(s);
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }
    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }
    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }
    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

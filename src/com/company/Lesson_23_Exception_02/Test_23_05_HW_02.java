package com.company.Lesson_23_Exception_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/
public class Test_23_05_HW_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String s = bf.readLine();
        char[] charArray = s.toCharArray();
        ArrayList<Character> ch1 = new ArrayList<>();
        ArrayList<Character> ch2 = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (isVowel(charArray[i])) {
                ch1.add(charArray[i]);
            } else if (charArray[i] == ' ') {
                continue;
            } else {
                ch2.add(charArray[i]);
            }
        }
        for (char c : ch1) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c : ch2) {
            System.out.print(c + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d)
                return true;
        }
        return false;
    }
}

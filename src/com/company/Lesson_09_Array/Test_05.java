package com.company.Lesson_09_Array;

// Ввести 5 строк с клавиатуры и записать их в массив

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String [] s = new String[5];
        for (int a=0; a<s.length; a++){
            System.out.println("Enter a text: ");
            s[a]= bf.readLine();
        }
        for (int b=0; b<s.length; b++) {
            System.out.println(s[b]);

        }
    }
}


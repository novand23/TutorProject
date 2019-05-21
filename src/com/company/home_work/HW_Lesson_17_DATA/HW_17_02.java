package com.company.home_work.HW_Lesson_17_DATA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW_17_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int a = Integer.parseInt(bf.readLine());
        int b = 0;
        while (a != 0) {
            int c = a % 10;
            a = a / 10;
            b = b * 10 + c;
        }
        System.out.println(b);

    }
}


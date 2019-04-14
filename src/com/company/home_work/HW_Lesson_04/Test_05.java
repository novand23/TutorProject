package com.company.home_work.HW_Lesson_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_05 {
    public static void main(String []args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text: ");
        String str = bf.readLine();
        System.out.println("Enter number: ");
        int n = Integer.parseInt(bf.readLine());

        int a = 0;
        while (a<n){
            System.out.println(str);
            a++;
        }
        }
    }


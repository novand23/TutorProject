package com.company.Lesson_09;

// Ввести 5 строк с клавиатуры и записать их в массив

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a text: ");
        String s1 = bf.readLine();
        System.out.println("Enter a text: ");
        String s2 = bf.readLine();
        System.out.println("Enter a text: ");
        String s3 = bf.readLine();
        System.out.println("Enter a text: ");
        String s4 = bf.readLine();
        System.out.println("Enter a text: ");
        String s5 = bf.readLine();

        String[] a = new String[5];
        a[0] = s1;
        a[1] = s2;
        a[2] = s3;
        a[3] = s4;
        a[4] = s5;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/

        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));*/

        Scanner scan = new Scanner(System.in);
        String [] s = new String[5];
        for (int a=0; a<s.length; a++){
            System.out.println("Enter a text: ");
            s[a]= scan.nextLine();
        }
        for (int b=0; b<s.length; b++) {
            System.out.println(s[b]);

        }
    }
}


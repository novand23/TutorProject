package com.company.lesson_02;

public class Test_03 {
    public static void main(String[] args) {
        // > < >= <= == != && (и) || (или)

        int age = 8;

        if (age > 18 && age < 21) {
            System.out.println("OK!");
        } else if (age >=21 || age < 6) {
            System.out.println("OK-OK!");
        } else {
            System.out.println("BYE!");
        }
    }
}

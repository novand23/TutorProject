package com.company.lesson_03;

public class Test_02 {
    public static void main(String[] args) {

        System.out.println(sum(54,46));
        System.out.println(sub(54,46));
        System.out.println(multy(54,46));
        System.out.println(div(54,46));
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int multy(int n1, int n2) {
        return n1 * n2;
    }

    public static double div(double n1, double n2) {
        return n1 / n2;
    }
}

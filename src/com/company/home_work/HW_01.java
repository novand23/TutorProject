package com.company.home_work;

public class HW_01 {
    public static void main (String [] args){
        int number1=10; //18
        int number2=18; //21
        int number3=21; //10
        int number4=number1;

        number1=number2;
        number2=number3;
        number3=number4;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}

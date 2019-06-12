package com.company.Lesson_22_Exception_01;

public class Test_22_01_Lecture {
    public static void main (String[]args){
        System.out.println("Before try");
        try {
            System.out.println("Inside try 1");
            int a = 50 / 12;
            System.out.println("Inside try 2");
            int [] arr = new int[1];
            System.out.println(arr[2]);
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e){
            System.out.println("Another exe");
        }finally {
            System.out.println("Finally");
        }

        System.out.println("After try");
    }
}

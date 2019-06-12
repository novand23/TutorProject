package com.company.Lesson_22_Exception_01;
/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/
public class Test_22_03_String {
    public static void main (String[]args){
        try{
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}

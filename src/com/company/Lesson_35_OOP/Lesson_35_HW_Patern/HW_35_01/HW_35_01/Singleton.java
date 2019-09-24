package com.company.Lesson_35_OOP.Lesson_35_HW_Patern.HW_35_01.HW_35_01;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
     if (instance == null){
         instance = new Singleton();
        }
        return instance;
    }
}

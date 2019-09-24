package com.company.Lesson_35_OOP.HW_35_02;

public class Earth implements Planet {
    private static Earth instance;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }
}

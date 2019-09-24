package com.company.Lesson_35_OOP.HW_35_02;

public class Moon implements Planet {
    private static Moon instance;

    private Moon() {
    }
    public static Moon getInstance() {
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }
}

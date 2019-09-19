package com.company.Lesson_35_OOP.Test_35_01;

import com.company.Lesson_35_OOP.Test_35_01.Flyable;

public class Plane implements Flyable {

    private int pasenger;

    public Plane(int pasenger) {
        this.pasenger = pasenger;
    }

    public int getPasenger() {
        return pasenger;
    }

    @Override
    public String fly() {
        return null;
    }

    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }
}

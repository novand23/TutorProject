package com.company.Lesson_35_OOP;

public class Helicopter implements Flyable {

     private int pasenger;

    public Helicopter(int pasenger) {
        this.pasenger = pasenger;
    }

    public int getPasenger() {
        return pasenger;
    }

    @Override
    public String fly() {
        return "Helicopter is flying";
    }

    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }
}

package com.company.Lesson_31_OOP;

abstract class Hen {

    public String country;

    public Hen(String country) {
        this.country = country;
    }

    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я курица";
    }

}
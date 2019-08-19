package com.company.Lesson_31_OOP;

public class RussianHen extends Hen {

    public RussianHen(String country) {
        super(country);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 42;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + country + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}


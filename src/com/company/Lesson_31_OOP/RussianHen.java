package com.company.Lesson_31_OOP;

public class RussianHen extends Hen {


    @Override
    public int getCountOfEggsPerMonth() {
        return 42;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + Test_31_01.HenFactory.getHen(Country.RUSSIAN.getValue()) + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}


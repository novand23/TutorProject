package com.company.Lesson_31_OOP;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 60;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + Test_31_01.HenFactory.getHen(Country.UKRAINA.getValue()) + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

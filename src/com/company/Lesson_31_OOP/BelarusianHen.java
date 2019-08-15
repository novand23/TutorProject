package com.company.Lesson_31_OOP;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 53;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + Test_31_01.HenFactory.getHen(Country.BELARUSSIA.getValue()) + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

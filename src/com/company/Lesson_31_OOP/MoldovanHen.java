package com.company.Lesson_31_OOP;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 45;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + Test_31_01.HenFactory.getHen(Country.MOLDOVA.getValue()) + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

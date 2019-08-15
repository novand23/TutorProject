package com.company.Lesson_31_OOP;

public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 53;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " " + "Моя страна - " +Country.BELARUSSIA+"Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}

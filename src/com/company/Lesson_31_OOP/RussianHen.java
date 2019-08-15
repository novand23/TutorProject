package com.company.Lesson_31_OOP;

public class RussianHen extends Hen implements Country {


    @Override
    public int getCountOfEggsPerMonth() {
        return 42;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " " + "Моя страна - "+Country.c1 + "Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}


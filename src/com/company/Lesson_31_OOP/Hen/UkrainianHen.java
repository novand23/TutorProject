package com.company.Lesson_31_OOP.Hen;

import com.company.Lesson_31_OOP.Hen.Hen;

public class UkrainianHen extends Hen {

    public UkrainianHen(String country) {
        super(country);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 60;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + country + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

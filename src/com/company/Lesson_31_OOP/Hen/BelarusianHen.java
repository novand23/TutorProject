package com.company.Lesson_31_OOP.Hen;

import com.company.Lesson_31_OOP.Hen.Hen;

public class BelarusianHen extends Hen {

    public BelarusianHen(String country) {
        super(country);
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 53;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + country + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

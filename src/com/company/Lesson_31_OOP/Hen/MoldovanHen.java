package com.company.Lesson_31_OOP.Hen;

import com.company.Lesson_31_OOP.Hen.Hen;

public class MoldovanHen extends Hen {

    public MoldovanHen(String country) {
        super(country);
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 45;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " " + "моя страна - " + country + ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

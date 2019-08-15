package com.company.Lesson_31_OOP;

public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 45;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+ " " + "Моя страна - " + "Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}

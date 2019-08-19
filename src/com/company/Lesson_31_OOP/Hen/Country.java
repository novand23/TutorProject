package com.company.Lesson_31_OOP.Hen;

public enum Country {
    RUSSIAN("Россия"),
    UKRAINA("Украина"),
    MOLDOVA("Молдова"),
    BELARUSSIA("Белоруссия");

    private String value;

    Country(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


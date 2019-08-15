package com.company.Lesson_31_OOP;

public enum Country {
    RUSSIAN("Россия"),
    UKRAINA("Украина"),
    MOLDOVA("Молдовва"),
    BELARUSSIA("Белоруссия");

    private String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}


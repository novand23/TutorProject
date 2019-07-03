package com.company.Lesson_29_OOP_Interface;

/*
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/
public class Test_HW_29_05 {
    public static void main(String[] args) {
    System.out.println(new Today());
    }
}

interface Weather {

    String getWeatherType();
}

interface WeatherType {

    String s1 = "Sunny";
    String s2 = "Snowy";
    String s3 = "Rain";
    String s4 = "Fog";
    String s5 = "Mainly cloudy";

}

class Today implements Weather, WeatherType {

    private String type;

    @Override
    public String getWeatherType() {
        int i = (int) (Math.random() * 5);
        if (i == 0) {
            type = WeatherType.s1;
        }
        if (i == 1) {
            type = WeatherType.s2;
        }
        if (i == 2) {
            type = WeatherType.s3;
        }
        if (i == 3) {
            type = WeatherType.s4;

        }
        if (i == 4){
            type = WeatherType.s5;
        }

        return type;
    }

    public String toString(){
        return String.format("%s for today", this.getWeatherType());
    }
}
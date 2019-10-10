package com.company.Lesson_39_Mnogopotochnost;

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1. В выполняющем классе создать переменную isStopped, присвоить ей значение false
2. Создать класс Clock, унаследовать его от Thread
3. В классе Clock:
- создать параметры cityName, hours, minutes, seconds - пдумать, какой тип у каждого параметра
- создать конструктор и инициализировать все параметры класса, так же запустить нить в конструкторе
- создать и реализовать логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
- создать метод run:
 -- пока переменная isStopped равняется false выполнять метод printTime;
 -- отлавливать все checked исключения.
4. В выполняющем методе:
- создать объект класса Clock
- отправить главную нить в сон на 4 секунды
- поменять значение переменной isStopped на true
- отправить главную нить в сон на 1 секунду
*/
public class Test_39_03 {
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {

        Clock1 clock1 = new Clock1("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }
}

class Clock1 extends Thread {
    private static String cityName;
    private static int hours;
    private static int minutes;
    private static int seconds;

    public Clock1(String cityName, int hours, int minutes, int seconds) {
        this.cityName = cityName;
        Clock1.hours = hours;
        Clock1.minutes = minutes;
        Clock1.seconds = seconds;
        start();
    }

    public static void printTime() throws InterruptedException {
        while (!Test_39_03.isStopped) {
            if (hours == 23 & minutes == 59 & seconds == 59) {
                hours = 0;
                minutes = 0;
                seconds = 1;
                System.out.println("В г. Лондон сейчас полночь!");
                Thread.sleep(1000);
            } else if (minutes == 59 & seconds == 59) {
                minutes = 0;
                seconds = 0;
                hours++;
            } else if (seconds == 60) {
                seconds = 0;
                minutes++;
            } else {
                seconds++;
            }
            System.out.println("В г. " + cityName + " сейчас " + hours + ":" + minutes + ":" + seconds + "!");
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        while (!Test_39_03.isStopped) {
            try {
                printTime();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

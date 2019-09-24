package com.company.Lesson_35_OOP.HW_35_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Singleton pattern Lazy initialization.
1. Создать интерфейс Planet, в нём создать 3 переменные:
    String SUN = "sun";
    String MOON = "moon";
    String EARTH = "earth";
2. В отдельных файлах создать три синглтон класса Sun, Moon, Earth.
3. Реализовать интерфейс Planet для классов Sun, Moon, Earth.
4. В классе Solution создать переменную static Planet thePlanet;
4. В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet.
5. Реализовать функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считать один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, то создать соответствующий объект и присвоить его Planet thePlanet, иначе обнулить Planet thePlanet.
5.3. Сравнивать введенный параметр можно только с константами из Planet, нельзя создавать свои строки.
6. В методе main вывести на экран значение переменной thePlanet.
*/
public class HW_35_02 {
    public static void main (String[]args){
        Solution s = new Solution();
        System.out.println(s);
    }

}

class Solution{
    static Planet thePlanet;

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        if (s == Planet.SUN){
            thePlanet = Sun.getInstance();
        } else if (s == Planet.MOON){
            thePlanet = Moon.getInstance();
        } else if (s == Planet.EARTH){
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }

    }
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

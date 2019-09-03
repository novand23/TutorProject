package com.company.Lesson_33;

/*
1.1 Создать класс Constants с переменными:
String WANT_STRING = "Я хочу ездить на ";
String LUXURIOUS_CAR = "роскошной машине";
String CHEAP_CAR = "дешевой машине";
String FERRARY_NAME = "Феррари";
String LANOS_NAME = "Ланосе";
1.2 Для вывода использовать можно только переменные из класса Constants.
2. Создать класс Ferrari, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
3. Создать класс Lanos, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
4. Создайте класс LuxuriousCar(РоскошнаяМашина).
5. Создайте класс CheapCar(ДешеваяМашина).
6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
9. В класах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так,
чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
10. В выполняющем методе вызовите метод printlnDesire() у всех классов, в который он реализован.
*/
public class Test_33_02 {
    public static void main(String[] args) {
        new Ferrari().printlnDesire();
        new Lanos().printlnDesire();
        new LuxuriousCar().printlnDesire();
        new CheapCar().printlnDesire();
    }

}

class Constants {
    static String WANT_STRING = "Я хочу ездить на ";
    static String LUXURIOUS_CAR = "роскошной машине";
    static String CHEAP_CAR = "дешевой машине";
    static String FERRARY_NAME = "Феррари";
    static String LANOS_NAME = "Ланосе";
}

class Ferrari extends LuxuriousCar{
    public void printlnDesire() {
        System.out.println(Constants.WANT_STRING + Constants.FERRARY_NAME);
    }
}

class Lanos extends CheapCar{
    public void printlnDesire() {
        System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
    }
}

class LuxuriousCar {
     void printlnDesire() {
        System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
    }
}
class CheapCar {
    protected void printlnDesire() {
        System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
    }
}

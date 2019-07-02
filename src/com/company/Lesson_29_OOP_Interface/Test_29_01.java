package com.company.Lesson_29_OOP_Interface;
/*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
*/
public class Test_29_01 {
    public static void main (String [] args){

    }
}

interface Drink{

    static boolean isAlcoholic(){
        int a = (int) (Math.random()*2);
        if (a == 0){
            return true;
        } else {
            return false;
        }
    }
}

class AlcoholicBeer implements Drink {



}
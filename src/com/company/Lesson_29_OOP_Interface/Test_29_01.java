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
        AlcoholicBeer al = new AlcoholicBeer();
        al.toString();
    }
}

interface Drink{

    public boolean isAlcoholic();


}

class AlcoholicBeer implements Drink {

    @Override
    public boolean isAlcoholic() {
        return true;
    }


    public String toString() {
        String s;
        if (isAlcoholic()){
            s =  "Напиток алкогольный";

        } else {
            s = "Напиток безалкогольный";
        }
        return s;
    }
}
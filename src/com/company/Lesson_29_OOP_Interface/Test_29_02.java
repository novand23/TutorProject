package com.company.Lesson_29_OOP_Interface;
/* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/
public class Test_29_02 {
    public static void main (String[]args){
        Drink1 drink = new Cola();
        Drink1 drink1 = new Beer();

        mathod(drink);
        mathod(drink1);
    }

    public static void mathod (Drink1 drink) {
        if (drink.isAlcoholic()){
            System.out.println(drink.getClass().getSimpleName() +" - Алкогольный напиток");
        } else {
            System.out.println(drink.getClass().getSimpleName() +" - Безалкогольный напиток");
        }
    }
}

interface Drink1 {

    public boolean isAlcoholic();
}

class Cola implements Drink1{

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}

class Beer implements Drink1{

    @Override
    public boolean isAlcoholic() {
        return true;
    }
}
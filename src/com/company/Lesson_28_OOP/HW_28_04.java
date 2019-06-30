package com.company.Lesson_28_OOP;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class HW_28_04 {
    public static void main(String[] args) {
        mathod(new UnknownAnimal());
    }


    private static void mathod(Object o) {
        if (o instanceof Cow) {
            System.out.println("Корова");
        } else if (o instanceof Whale) {
            System.out.println("Кит");
        } else if (o instanceof Dog3) {
            System.out.println("Собака");
        } else if (o instanceof UnknownAnimal) {
            System.out.println("Неизвестное животное");
        }
    }
}

class Cow {

}

class Whale {

}

class Dog3 {

}

class UnknownAnimal {

}
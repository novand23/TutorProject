package com.company.Lesson_28_OOP;

/* Или «Кошка», или «Птица», или «Лампа», или «Собака»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Кошка», «Птица», «Лампа», «Собака».
*/
public class Test_28_02 {
    public static void main(String[] args) {
    method(new Bird());
    }

    private static void method (Object o){
        if (o instanceof Cat1){
            System.out.println("Кошка");
        } else if (o instanceof Bird){
            System.out.println("Птица");
        } else if (o instanceof Lamp){
            System.out.println("Лампа");
        } else if (o instanceof Dog1){
            System.out.println("Собака");
        }
    }
}

class Cat1{

}
class Bird{

}
class Lamp{

}
class Dog1{

}
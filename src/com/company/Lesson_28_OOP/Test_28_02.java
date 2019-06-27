package com.company.Lesson_28_OOP;

/* Или «Кошка», или «Птица», или «Лампа», или «Собака»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Кошка», «Птица», «Лампа», «Собака».
*/
public class Test_28_02 {
    public static void main (String[] args){


    }
    private static void method (Object o){
        if (o instanceof Cat1){

        }
    }
}
class Animal{

    public String Animal (){
        return "Животное";
    }
}
class Cat1 extends Animal {

    @Override
    public String Animal() {
        return "Кошка";
    }
}
class Dog1 extends Animal{

    @Override
    public String Animal() {
        return "Собака";
    }
}
class Bird extends Animal{
    @Override
    public String Animal() {
        return "Птица";
    }
}
class Lamp{
    public String Animal (){
        return "Лампа";
    }
}
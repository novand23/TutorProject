package com.company.Lesson_28_OOP;
/* Создать класс Pet с методом getName, который возвращает строку "Я - пушистик"
Создать класс Cat и унаследоваться от Pet
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись
«Я - кот».
*/
public class HW_28_05 {
    public static void main (String []args){
        Pet1 cat2 = new Cat2();
        cat2.getName();
    }
}


class Pet1 {

    public void getName (){
        System.out.println("Я - пушистик");
    }
}

class Cat2 extends Pet1{

    @Override
    public void getName() {
        System.out.println("Я - кот");
    }
}
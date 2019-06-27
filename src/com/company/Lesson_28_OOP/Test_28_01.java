package com.company.Lesson_28_OOP;
/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/

public class Test_28_01 {
    public static void main(String[] args) {

    }
}

class Pet {
    public Pet getChild() {
        Pet pet1 = new Pet();
        return pet1;
    }
}

class Cat extends Pet {
    @Override
    public Cat getChild() {
        Cat cat1 = new Cat();
        return cat1;
    }
}

class Dog extends Pet {
    @Override
    public Dog getChild() {
        Dog dog1 = new Dog();
        return dog1;
    }
}
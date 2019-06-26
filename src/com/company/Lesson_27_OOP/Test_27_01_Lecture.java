package com.company.Lesson_27_OOP;

import java.util.ArrayList;
import java.util.List;

public class Test_27_01_Lecture {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat1", 2, 12);
        cat.ok();

        Animal dog = new Animal("Dog1", 3);
        dog.printName();

        Animal dog1 = new Dog("Dog2", 4);
        dog1.printName();

        List<String> list = new ArrayList<>();
        list.add("text");
    }
}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName(){
        System.out.println("Name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat extends Animal{

    private int tailLength;

    public Cat(String name, int age, int tailLength) {
        super(name, age);
        this.tailLength = tailLength;
    }

    public void ok(){
        System.out.println("ok");
    }
}

class Tiger extends Cat{

    public Tiger(String name, int age, int tailLength) {
        super(name, age, tailLength);
    }
}

class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void printName() {
        System.out.println("Dog name is " + this.getName());
    }

    public void k(){

    }
}


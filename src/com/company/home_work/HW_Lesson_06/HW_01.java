package com.company.home_work.HW_Lesson_06;

/* 1) Создать класс Dog с параметрами: name, age, tailLength. Подумай, какого типа должна быть каждая переменная.
 2) В выполняющем методе создать два объекта класса Dog и инициализировать их поля
 3) Вывести в консоль данные о каждой собаке в виде - "Name: [dog.name], age: [dog.age], tail length: [dog.tailLength]." */

public class HW_01 {
    public static void main (String [] args){
        Dog dog1 = new  Dog("Ibis", 4, 20);
        /*System.out.format("Name: %s, age: %d, tailLength: %d", dog1.getName(), dog1.getAge(), dog1.getTailLength());*/
        Dog dog2 = new Dog("Gustav", 2,18);
        /*System.out.format("\nName: %s, age: %d, tailLength: %d", dog2.getName(), dog2.getAge(), dog2.getTailLength());*/
        System.out.println("Первая собака");
        System.out.println(dog1);
        System.out.println("Вторая собака");
        System.out.println(dog2);
    }
}

class Dog {
    private String name;
    private int age;
    private int tailLength;

    public Dog (String name, int age, int tailLength){
        this.name=name;
        this.age=age;
        this.tailLength=tailLength;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getTailLength(){
        return tailLength;
    }
    public void setTailLength(int tailLength){
        this.tailLength=tailLength;
    }

    public String toString() {
        return String.format("Name: %s, age: %d, tailLength: %d", name, age, tailLength);
    }
}


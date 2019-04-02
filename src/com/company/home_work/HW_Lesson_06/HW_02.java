package com.company.home_work.HW_Lesson_06;
/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы владельцем каждого питомца была одна и таже женщина.
*/
public class HW_02 {
    public static void main (String[]args){
    Woman Woman1 = new Woman("Rita", 35);
    Cat Cat1 = new Cat("Barsik",5, Woman1);
    System.out.println(Cat1);
    }

}
class Woman {
    private String name;
    private int age;

    public Woman (String name, int age){
        this.name=name;
        this.age=age;
    }

}
class Cat {
    private String name;
    private int age;
    private Woman owner;
    public Cat (String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
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
        public Woman getOwner() {
            return owner;
        }
        public void setOwner(Woman owner){
        this.owner= owner;
    }
    public String toString() {
        return String.format("Name: %s, age: %d, tailLength: %d", name, age, owner);
    }
}
/*
class DOG{
    private String name;
    private int age;
    private String owner;
}
class Fish {
    private String name;
    private int age;
    private String owner;
}
*/

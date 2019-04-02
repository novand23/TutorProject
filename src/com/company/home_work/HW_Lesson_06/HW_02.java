package com.company.home_work.HW_Lesson_06;

/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы владельцем каждого питомца была одна и таже женщина.
*/
public class HW_02 {
    public static void main(String[] args) {
        Woman Woman = new Woman("Rita", 35);
        Cat Cat1 = new Cat("Barsik", 5, Woman);
        DOG DOG = new DOG("Uba",8, Woman);
        Fish Fish = new Fish("Lou", 1, Woman);
        System.out.println(Cat1);
        System.out.println(DOG);
        System.out.println(Fish);
    }

}

class Woman {
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
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

class Cat {
    private String name;
    private int age;
    private Woman owner;

    public Cat(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
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

    public Woman getOwner() {
        return owner;
    }

    public void setOwner(Woman owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("\nName: %s, age: %d, owner: %s", getName(), getAge(), getOwner().getName());
    }
}
class DOG{
    private String name;
    private int age;
    private Woman owner;

    public DOG (String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
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

    public Woman getOwner() {
        return owner;
    }

    public void setOwner(Woman owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("\nName: %s, age: %d, owner: %s", getName(), getAge(), getOwner().getName());
    }
}
class Fish {
    private String name;
    private int age;
    private Woman owner;

    public Fish (String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
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

    public Woman getOwner() {
        return owner;
    }

    public void setOwner(Woman owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("\nName: %s, age: %d, owner: %s", getName(), getAge(), getOwner().getName());
    }
}

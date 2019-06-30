package com.company.Lesson_28_OOP;
/* Fly, Move, Eat для классов Dog, Car, Duck, Airplane
Создать интерфейсы Fly(летать), Move(передвигаться), Eat(есть) с методами fly, move, eat соответсвенно.
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/
public class Test_28_03_interface {
    public static void main (String [] args){
        Dog2 dog2 = new Dog2();
        Car car = new Car();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();
        dog2.move();
        dog2.eat();
        car.move();
        duck.eat();
        duck.fly();
        duck.move();
        airplane.fly();
        airplane.move();
    }
}


interface Fly{
    void fly();
}
interface Move{
    void move();
}
interface Eat{
    void eat();
}
class Dog2 implements Move, Eat {


    @Override
    public void move() {
        System.out.println("Собака бегает.");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушает корм.");
    }
}

class Car implements Move{

    @Override
    public void move() {
        System.out.println("Машина передввигаеться.");
    }
}

class Duck implements Fly, Move, Eat{

    @Override
    public void fly() {
        System.out.println("Утка летает.");
    }

    @Override
    public void move() {
        System.out.println("Утка идет.");

    }

    @Override
    public void eat() {
        System.out.println("Утка ест.");
    }
}

class Airplane implements Fly, Move{

    @Override
    public void fly() {
        System.out.println("Самолет летит.");
    }

    @Override
    public void move() {
        System.out.println("Самолет передвигаеться.");
    }
}
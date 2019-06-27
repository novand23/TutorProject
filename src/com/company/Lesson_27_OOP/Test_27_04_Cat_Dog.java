package com.company.Lesson_27_OOP;

/*
 Создать классы Cat и Dog с параметрами name и speed
 Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public class Test_27_04_Cat_Dog {
    public static void main(String[] args) {
        Cat cat = new Cat("Ron", 15);
        Dog dog = new Dog("Greg", 26);
    }

    public static class Cat {
        private String name;
        private int speed;

        public Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        private String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        private int getSpeed() {
            return speed;
        }

        private void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isDogNear(Dog dog) {
            return this.speed > dog.getSpeed();
        }

    }

    public static class Dog {
        private String name;
        private int speed;

        public Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        private String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        private int getSpeed() {
            return speed;
        }

        private void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isCatNear(Cat cat) {
            return this.speed > cat.getSpeed();
        }

    }
}

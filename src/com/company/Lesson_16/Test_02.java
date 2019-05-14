package com.company.Lesson_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметри с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/
public class Test_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> listcats = new ArrayList<>();
        while (true) {
            System.out.println("Enter name: ");
            String name = bf.readLine();
            if (name.isEmpty()) break;
            System.out.println("Enter age: ");
            int age = Integer.parseInt(bf.readLine());
            System.out.println("Enter weight: ");
            double weight = Double.parseDouble(bf.readLine());
            System.out.println("Enter tail: ");
            double tail = Double.parseDouble(bf.readLine());
            Cat cat = new Cat(name,age,weight,tail);
            listcats.add(cat.toString());
        }


    }
}

class Cat {
    private String name;
    private int age;
    private double weight;
    private double tail;

    public Cat(String name, int age, double weight, double tail) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tail = tail;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    public String toString() {
        return String.format("\nCat name is %s, age is %d, weight is %d, tail is %d", getName(), getAge(), getWeight(), getTail());
    }
}

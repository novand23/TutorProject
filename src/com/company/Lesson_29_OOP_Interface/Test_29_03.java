package com.company.Lesson_29_OOP_Interface;

/*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User, что бы он возвращал следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/
public class Test_29_03 {
    public static void main (String[] args){
        System.out.println(Matrix.user1.toString());
        System.out.println(Matrix.user2.toString());
    }
}

interface DBObject {

   DBObject initializeIdAndName(long id, String name);
}

class User implements DBObject{

    private long id;
    private String name;

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
       return this;
    }

    public String toString(){
        return String.format("User has name %s, id = %d", name, id);
    }
}

class Matrix{
    static User user1 = new User().initializeIdAndName(12215, "Jon");
    static User user2 = new User().initializeIdAndName(78954,"Derek");
 }
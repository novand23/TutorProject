package com.company.home_work.HW_Lesson_06;
/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и
   сделать так, чтобы объекты стали мужем и женой.
*/
public class HW_03 {
    public static void main (String[]args){
        Women Women = new Women("Alisa", 25, null);
        Man Man = new Man("Rob", 28, Women);
        Women.setHusband(Man);
        System.out.format("\nName: %s, Age: %d, Husband: %s", Women.getName(),Women.getAge(), Women.getHusband().getName());
        System.out.format("\nName: %s, Age: %d, Husband: %s", Man.getName(),Man.getAge(), Man.getHusband().getName());
        System.out.println();
    }
}

class Women {
    private String name;
    private int age;
    private Man husband;

    public Women (String name, int age, Man husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }
    public String getName () {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }
    public Man getHusband(){
        return husband;
    }
    public void setHusband (Man husband){
        this.husband=husband;
    }
}

class Man {
    private String name;
    private int age;
    private Women husband;

    public Man(String name, int age, Women husband) {
        this.name = name;
        this.age = age;
        this.husband = husband;
    }
    public String getName () {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public Women getHusband(){
        return husband;
    }
    public void setHusband (Women husband){
        this.husband=husband;
    }
}
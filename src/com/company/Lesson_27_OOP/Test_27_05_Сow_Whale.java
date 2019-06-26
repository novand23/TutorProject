package com.company.Lesson_27_OOP;

/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/
public class Test_27_05_Сow_Whale {
    public static void main(String[] args) {
        Cow cow = new Cow("Lol");
        Cow whale = new Whale("Tris");
        System.out.println(cow.getName());
        System.out.println(whale.getName());
    }
}

class Cow {
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return "Я - корова";
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Whale extends Cow {

    public Whale(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Я не корова, Я - кит.";
    }
}

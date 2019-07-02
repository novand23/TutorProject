package com.company.Lesson_29_OOP_Interface;

/*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
5. Создать класс GermanyTranslator, который наследуется от абстрактного класса Translator.
6. Реализовать все абстрактные методы.
7. Подумай, что должен возвращать метод getLanguage.
8. Программа должна выводить на экран "Я переводчик с немецкого".
*/
public class Test_29_04 {
    public static void main(String[] args) {
        System.out.println(new EnglishTranslator().translate());
        System.out.println(new GermanyTranslator().translate());
    }
}

abstract class Translator {
    public abstract String getLanguage();

    public String translate() {
        return "Я переводчик с " + getLanguage();

    }
}

class EnglishTranslator extends Translator {

    @Override
    public String getLanguage() {
        return "английского";
    }

    @Override
    public String translate() {
        return super.translate();
    }
}

class GermanyTranslator extends Translator {

    @Override
    public String getLanguage() {
        return "немецкого";
    }

    @Override
    public String translate() {
        return super.translate();
    }
}
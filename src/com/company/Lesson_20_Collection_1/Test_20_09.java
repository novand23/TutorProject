package com.company.Lesson_20_Collection_1;

import java.util.HashMap;
import java.util.Map;

/*
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
Вывести результат на экран, каждый элемент с новой строки.
Вывести результат на экран в виде:
васька - ВАСЬКА
мурка - МУРКА
...
*/
public class Test_20_09 {
    public static void main (String[]args){
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        HashMap<String,Cat> hashMap = hashMap(cats);

        for (Map.Entry<String,Cat> cat: hashMap.entrySet()){
            System.out.println(cat.getKey()+" - "+cat.getValue());
        }

    }
    private static HashMap<String, Cat> hashMap (String[] cats){
        HashMap<String,Cat> hashMap = new HashMap<>();
        for (String s: cats){
            hashMap.put(s,new Cat(s));
        }
        return hashMap;
    }


}
class Cat{
    private String name;
    public Cat(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        name = name;
    }
    public String toString() {
        return name != null ? name.toUpperCase(): null;
    }

}


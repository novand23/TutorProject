package com.company.Lesson_33;

import java.util.ArrayList;
import java.util.List;

/* Валюты
1. Создать абстрактный класс Money
1.0 Реализуй метод getAmount в классе Money:
1.1. Подумай, какого типа нужно создать приватную переменную, если метод getAmount будет ее возвращать.
1.2. Создай приватную переменную этого типа и верни ее в методе getAmount.
1.3. В конструкторе присвой ей значение, полученное параметром.
1.4. Создай абстрактный метод    String getCurrencyName();
2. В отдельном файле создай класс Hrivna.
3. Наследуй класс Hrivna от класса Money.
4. В классе Hrivna реализуй метод getCurrencyName, который возвращает "HRN".
5. В отдельном файле создай класс USD.
6. Наследуй класс USD от класса Money.
7. В классе USD реализуй метод getCurrencyName, который возвращает "USD".
8. В выполняющем классе Solution создать вложенный класс Person:
8.1 Создать во вложенном классе 2 переменные: name - имя, allMoney - список со всей валютой у объекта.
8.2 В конструкторе присвой значение name, полученное параметром.
8.3 Подумай, объекты каких классов можно добавить в список(лист) allMoney.
8.4 Добавь в конструктор класса Person заполнение листа allMoney объектами всех возможных классов.
9. В выполняющем методе создать объект с типом Person.
10. Вывести на экран надпись типа - person.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName()
*/
public class Test_33_04 {
    public static void main (String[]args){
        Hrivna hrn = new Hrivna(965);
        USD usd = new USD(582);
        List<Money> list = new ArrayList<>();
        list.add(hrn);
        list.add(usd);

        Person person = new Person("Dima", list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(person.name + " имеет заначку в размере " + list.get(i).getAmount() + list.get(i).getCurrencyName());
        }

    }
    static class Person{
        private String name;
        private List<Money> list;

        public Person(String name, List<Money> list) {
            this.name = name;
            this.list = list;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Money> getList() {
            return list;
        }

        public void setList(List<Money> list) {
            this.list = list;
        }
    }
}

abstract class Money{
    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public abstract String getCurrencyName();
}

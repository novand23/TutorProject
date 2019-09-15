package com.company.Lesson_33;
/* ООП - книги
1. Создать абстрактный класс Book с приватным параметром author.
1.2 Создать абстрактный метод Book getBook().
1.2 Создать абстрактный метод String getName().
1.3 Создать метод String getOutputByBookType() и проинициализировать в нём 2 переменные:
- String agathaChristieOutput, которая должна хранить текст author + ", " + getBook().getName() + " is a detective"
- String markTwainOutput, которая должна хранить текст getBook().getName() + " book was written by " + author
- После этого, в зависимости от типа объекта (MarkTwainBook, AgathaChristieBook), который вызывает данный метод,
он должен возвращает соответствующую переменную - agathaChristieOutput для книг Агаты Кристи, markTwainOutput для книг Марка Твена.
- Переопределить метод toString() так, что бы он возвращал результат метода getOutputByBookType().
2. Создайте public static класс MarkTwainBook, который наследуется от Book.
 Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2.1 В классе MarkTwainBook реализуйте все абстрактные методы.
2.2 Для метода getBook расширьте тип возвращаемого результата.
3. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
4. В main создать список книг. Добавить в список 2 книги:
- Tom Sawyer - автор Mark Twain
- Hercule Poirot - автор Agatha Christie
Вывести список на экран
*/

import java.util.LinkedList;
import java.util.List;

public class Test_33_03 {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}

abstract class Book {
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public abstract Book getBook();

    public abstract String getName();

    private String getOutputByBookType() {
        String agathaChristieOutput = author + ", " + getBook().getName() + " is a detective";
        String markTwainOutput = getBook().getName() + " book was written by " + author;

        String output = "output";
        if (this instanceof MarkTwainBook) {
            output = markTwainOutput;
        } else {
            output = agathaChristieOutput;
        }
        return output;
    }

    public String toString() {
        return getOutputByBookType();
    }

}

class MarkTwainBook extends Book {
    public String bookName = null;

    public MarkTwainBook(String bookName) {
        super("Mark Twain");
        this.bookName = bookName;
    }

    @Override
    public MarkTwainBook getBook() {
        return this;
    }

    @Override
    public String getName() {
        return this.bookName;
    }
}

class AgathaChristieBook extends Book {
    public String bookName;

    public AgathaChristieBook(String book) {
        super("Agatha Christie");
        this.bookName = book;
    }

    @Override
    public AgathaChristieBook getBook() {
        return this;
    }

    @Override
    public String getName() {
        return this.bookName;
    }
}




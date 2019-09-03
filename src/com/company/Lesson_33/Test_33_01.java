package com.company.Lesson_33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* MovieFactory
1. Добавить абстрактный класс Movie с абстрактным методом String getGenre().
2. Добавикть классы SoapOpera, Cartoon, Thriller и унаследовать их от Movie и реализовать метод String getGenre():
- в классе SoapOpera метод getGenre() должен вернуть строку "Genre is drama";
- в классе Cartoon метод getGenre() должен вернуть строку "Genre is comedy";
- в классе Thriller метод getGenre() должен вернуть строку "Genre is horror";
3. Создать класс MovieFactory с методом getMovie(String key)
4. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
5. Добавить в MovieFactory.getMovie получение объекта SoapOpera для ключа "soapOpera".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для люча "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName() + movie.getGenre();.
*/
public class Test_33_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        label:
        while (true) {
            String key = bf.readLine();
            switch (key) {
                case "cartoon":
                    MovieFactory.getMovie(key);
                    break;
                case "thriller":
                    MovieFactory.getMovie(key);
                    break;
                case "soapOpera":
                    MovieFactory.getMovie(key);
                    break;
                default:
                    break label;
            }
        }
    }
}

abstract class Movie {
    abstract public String getGener();
}

class SoapOpera extends Movie {

    @Override
    public String getGener() {
        return "Genre is drama";
    }
}

class Cartoon extends Movie {

    @Override
    public String getGener() {
        return "Genre is comedy";
    }
}

class Thriller extends Movie {

    @Override
    public String getGener() {
        return "Genre is horror";
    }
}

class MovieFactory {

    public static void getMovie(String key) {

        if ("cartoon".equals(key)) {
            Movie cartoon = new Cartoon();
            insta(cartoon);
        } else if ("soapOpera".equals(key)) {
            Movie soapOpera = new SoapOpera();
            insta(soapOpera);
        } else if ("thriller".equals(key)) {
            Movie thriller = new Thriller();
            insta(thriller);
        }
    }

    public static void insta(Movie movie) {
        if (movie instanceof SoapOpera) {
            System.out.println(movie.getClass().getSimpleName() + " - " + movie.getGener());
        }
        if (movie instanceof Cartoon) {
            System.out.println(movie.getClass().getSimpleName() + " - " + movie.getGener());
        }
        if (movie instanceof Thriller) {
            System.out.println(movie.getClass().getSimpleName() + " - " + movie.getGener());
        }
    }
}
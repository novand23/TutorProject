package Lesson_35_OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
0. Создать интерфейс Flyable с методом String fly();
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс Flyable.
2. Класс Plane должен иметь 1 конструктор с приватным параметром int - количество перевозимых пассажиров.
2.1 В классе Plane метод fly() должен возвращать строку "Plane is flying";
2.2 В классе Plane переопределить метод toString(), что бы он возвращал строку: fly() + " with " + getPasenger();
3.1 Класс Helicopter должен иметь 1 конструктор с приватным параметром int - количество перевозимых пассажиров.
3.2 В классе Helicopter метод fly() должен возвращать строку "Helicopter is flying";
3.3 В классе Helicopter переопределить метод toString(), что бы он возвращал строку: fly() + " with " + getPasenger();
4. В классе Solution создать статическую переменную Flyable result;quantity
5. В статическом методе reset класса Solution:
5.1. В бесконечном цикле считывать с консоли параметр типа String. Параметр может быть "plane" или "helicopter".
5.2. Если параметр равен "helicopter", то считать второй параметр типа int, статическому объекту Flyable result присвоить объект класса Helicopter.
5.3. Если параметр равен "plane", то считать второй параметр типа int, статическому объекту Flyable result присвоить объект класса Plane.
5.3. Иначе завершить ввод.
6. В статическом блоке инициализировать Flyable result вызвав метод reset, отловить все checked исключения.
7. В выполняющем методе сделать вывод на экран строку: The program worked! .
*/
public class Test_35_01 {
    public static void main(String[] args) {
        System.out.println("The program worked!");
    }

}

class Solution {
    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Flyable result;


    public static void reset() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String type = bf.readLine();
            if (type.equals("helicopter")) {
                int p = Integer.parseInt(bf.readLine());
                result = new Helicopter(p);
            } else if (type.equals("plane")) {
                int p = Integer.parseInt(bf.readLine());
                result = new Plane(p);
            } else {
                break;
            }

        }

    }

}

interface Flyable {
    String fly();
}
package com.company.Lesson_40_Mnogopotochnost;

import java.util.ArrayList;
import java.util.List;

/* Обратный отсчет
1. В выполняющем классе создать статический список строк
2. В статическом блоке добавить 5 строк в список, в виде: "Строка " + i, где i - число от 0 до 5
3. Создать класс Countdown, реализовать в нём интерфейс Runnable
4. В классе Countdown:
- создать приватную переменную int countFrom
- создать конструктор и инициализировать в нём переменную countFrom
- создать метод printCountdown()
- реализуй логику метода printCountdown так, чтобы каждые полсекунды выводился объект из
списка в обратном порядке - от переданного индекса до нуля.
- реализовать метод run(), он должен вызывать метод printCountdown(), пока countFrom больше нуля
5. В выполняющем методе создать нить и запустить её
Пример: Передан индекс 3
Пример вывода в консоль:
Строка 2
Строка 1
Строка 0
*/
public class Test_40_01 {
    static List<String> list = new ArrayList<>();

    static {
        for (int i = 0; i <= 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) {
        Countdown countdown = new Countdown(3);
        Thread thread = new Thread(countdown);
        thread.start();

    }
}

class Countdown implements Runnable {
    private int countFrom;

    public Countdown(int countFrom) {
        this.countFrom = countFrom;
    }

    public static void printCountdown(List<String> list, int countFrom) throws InterruptedException {
        for (int i = countFrom-1; i >= 0; i--) {
            Thread.sleep(500);
            System.out.println(list.get(i));
        }
    }

    @Override
    public void run() {
        if (countFrom >= 0) {
            try {
                printCountdown(Test_40_01.list, countFrom);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
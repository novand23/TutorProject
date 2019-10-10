package com.company.Lesson_39_Mnogopotochnost;

/*  (Секундомер)
1. В выполняющем классе создать статическую переменную isStopped, присвоить ей значение false
2. Создать класс Stopwatch, унаследовать его от Thread
3. Создать класс Runner
4. В классе Stopwatch:
- создать приватную переменную Runner owner;
- создать приватную переменную int stepNumber;
- создать конструктор и инициализировать в нём переменную owner;
- создать метод doSeveralSteps, пока что без реализации;
- создать метод run(), он должен:
  -- пока переменная isStopped равняется false выполнять метод doSeveralSteps;
  -- отлавливать все checked исключения.
5. В классе Runner создать параметры name, speed, stopwatch - подумать, какой тип данный у каждого параметра
5.1 Создать конструктор для инициализация всех параметров класса Runner
5.2 Сделать переменный name, speed приватными, создать для них геттеры
5.3 Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
5.4 Создать метод start(), он должен запускать нить stopwatch
6. Реализовать метод doSeveralSteps:
- увеличивать счетчик шага на один
- записывать скорость бегуна в новую переменную
- отправлять нить в сон на 1000 / speed1 мс
- выводить на экран надпись owner.getName() + " делает шаг №" + stepNumber + "!"
7. В выполняющем методе создать два объекта Runner
8. Вызвать метод start у каждого объекта
9. Отправить гланую нить в сон на 2 секунды
10. Поменять значение переменной isStopped на true
11. Отправить главную нить в сон на одну секунду
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
*/
public class Test_39_02 {
    public static boolean isStopped = false;

    public static void main (String[]args) throws InterruptedException {
        Runner runner1 = new Runner("Alex", 2);
        Runner runner2 = new Runner("Olaf", 4);
        runner1.start();
        runner2.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
        System.out.println();

    }
}


class Stopwatch extends Thread {
    private Runner owner;
    private int stepNumber;


    public Stopwatch(Runner owner) {
        this.owner = owner;
    }

    public void doSeveralSteps() throws InterruptedException {
        stepNumber=stepNumber+1;
        int speed = owner.getSpeed();
        Thread.sleep(1000/speed);
        System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
    }

    @Override
    public void run() {
        while (!Test_39_02.isStopped) {
            try {
                doSeveralSteps();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Runner {
    private String name;
    private int speed;
    private Stopwatch stopwatch;

    public Runner(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.stopwatch = new Stopwatch(this);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void start(){
        stopwatch.start();
    }
}



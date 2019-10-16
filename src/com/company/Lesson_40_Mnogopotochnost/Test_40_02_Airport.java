package com.company.Lesson_40_Mnogopotochnost;

/* Аэропорт
1. В выполняющем классе создать метод waiting(), который отправляет нить в сон на 100мс
2. В выполняющем классе создать метод takingOff(), который отправляет нить в сон на 100мс
3. Создать класс Runway (взлетная полоса)
3.1 В классе Runway:
- создать приватную переменную типа Thread
- для переменной создать геттер и сеттер
4. В выполняющем классе создать статическую переменную Runway, подумать, какой тип у данной переменной
5. Создать класс Plane, унаследовать его от Thread
6. В классе Plane:
- создать конструктор с параметром name, передать переменную name в конструктор суперкласса
- в конструкторе запустить нить
- реализовать метод run():
6.1 создать переменную isAlreadyTakenOff, подумать какой тип у переменной, инициализировать её значением по-умолчанию
6.2 пока переменная isAlreadyTakenOff имеет значение false, выполнять следующее:
- ЕСЛИ взлетная полоса свободна, занимать её
- выводить на экран надпись getName() + " взлетает"
- производить взлет самолета
- выводить на экран надпись getName() + " уже в небе"
- присвоить переменной isAlreadyTakenOff значение true
- освободить взлетную полосу
- ИНАЧЕ, если взлетная полоса занята самолетом
- выводить на экран надпись getName() + " ожидает"
- вызвать метод, который отвечает за ожидание
7. В выполняющем методе создать и запустить 3 нити(самолета)
*/
public class Test_40_02_Airport {

    public static void waiting() throws InterruptedException {
        Thread.sleep(100);
    }

    public static void takingOff() throws InterruptedException {
        Thread.sleep(100);
    }

    public static Runway runway;

    public static void main (String[]args){
        Plane plane1 = new Plane("747");
        Plane plane2 = new Plane("545");
        Plane plane3 = new Plane("997");

    }
}

class Runway {
    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) throws InterruptedException {
        if (thread == null) {
            this.thread = thread;
        } else {
            thread.join();
        }
    }
}

class Plane extends Thread {

    public Plane(String name) {
        super(name);
        start();
    }

    private static boolean isAlreadyTakenOff = false;

    @Override
    public void run() {
        while (!isAlreadyTakenOff) {
            if (Test_40_02_Airport.runway == null) {
                System.out.println(getName() + " взлетает");
                try {
                    Test_40_02_Airport.takingOff();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(getName() + " уже в небе");
                isAlreadyTakenOff = true;
            } else {
                System.out.println(getName() + " ожидает");
                try {
                    Test_40_02_Airport.waiting();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

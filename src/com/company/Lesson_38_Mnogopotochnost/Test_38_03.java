package com.company.Lesson_38_Mnogopotochnost;

import java.util.ArrayList;
import java.util.List;

/* Horse Racing
1. Создать класс Horse, унаследовать его от Thread
1.1 В классе Horse создать приватную переменную isFinished, подумать какой тип у этой переменной
1.2 Создать геттер для переменной isFinished
1.3 Создать конструктор с параметром String name, передавать этот параметр в конструктор суперкласса
1.4 Переопределить метод run(), добавить в него следующий код:
- запустить цикл на 1000 иттераций, когда будет достигнута последняя иттерация выводить на экран строку:
getName() + " has finished the race!"
- присвоить параметру isFinished значение true, у объекта, который запустил нить;
2. В выполняющем классе создать переменную int countHorses = 10;
3. В выполняющем классе создать метод List<Horse> prepareHorsesAndStart(), который должен:
- создавать список из лошадей, с размером, который указан в переменной countHorses
- добавлять в список объекты лошадей, в качестве имени отправлять "Horse_" + number, где number строка от 01 до countHorses + 1
- после того, как список заполнен, запускать нить для каждого объекта в списке
- возвращать список лошадей
4. Создать метод calculateHorsesFinished. Он должен:
- посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
- если лошадь еще не пришла к финишу (!isFinished()), то:
4.1. Вывести в консоль "Waiting for " + horse.getName().
4.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
*/
class Test_38_033 {
    public static int countHorses = 10;

    public static List<Horse> prepareHorsesAndStart(int countHorses) {
        List<Horse> list = new ArrayList<>(countHorses);
        for (int i = 0; i < countHorses; i++) {
            list.add(new Horse("Horse_" + (i + 1)));
        }
        for (Horse horse : list) {
            horse.start();
        }
        return list;
    }

    public static void calculateHorsesFinished(List<Horse> list) throws InterruptedException {

        for (Horse horse : list) {
            if (horse.isFinished()) {

            } else if (!horse.isFinished()) {
                System.out.println("Waiting for " + horse.getName());
                horse.join();
            }

        }
    }


    public static void main(String[] args) throws InterruptedException {
        calculateHorsesFinished(prepareHorsesAndStart(countHorses));
    }

}

class Horse extends Thread {
    private boolean isFinished;

    public Horse(String name) {
        super(name);
    }

    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 1000; ) {
            if (i == 1000) {
                isFinished = true;
                System.out.println(getName() + " has finished the race!");
                break;
            } else {
                i++;
            }
        }
    }
}

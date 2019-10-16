package com.company.Lesson_40_Mnogopotochnost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Считаем секунды
1. Создать класс Stopwatch, унаследовать его от Thread.
2. В выполняющем классе ввести с клавиатуры строку
3. Напиши реализацию метода run в нити Stopwatch (секундомер).
4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
5. Выведи количество секунд в консоль.
*/
public class Test_40_03_HW {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stopwatch stopwatch = new Stopwatch();
        Thread thread = new Thread(stopwatch);
        thread.start();
        String s = bufferedReader.readLine();
        thread.interrupt();
    }

}

class Stopwatch extends Thread {
    private int seconds;

    @Override
    public void run() {
        while (!isInterrupted()){
            try {
                Thread.sleep(1000);
                seconds++;
            } catch (InterruptedException e) {
                System.out.println(seconds);
                break;
            }

        }
    }
}
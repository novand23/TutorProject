package com.company.Lesson_23_Exception_02;

/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
NullPointerException
IndexOutOfBoundsException
NumberFormatException
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
*/
public class Test_23_04_HW_01 {
    public static void main(String[] args) {
        try {
            processExceptions();
        } catch (Exception e){
            printStack(e);
        }

    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    private static void processExceptions() {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new NullPointerException();
        }
        if (i == 1) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 2) {
            throw new NumberFormatException();
        }
    }
}

package com.company.Lesson_37_Mnogopotochnost;

public class Test_37_01_Thread {
    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        thread.start();
        System.out.println("Main");
    }

    public static class FirstThread extends Thread {
        static{
            System.out.println("Static");
        }

        @Override
        public void run() {
            System.out.println("It's run method!");
        }
    }
}

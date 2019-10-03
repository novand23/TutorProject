package com.company.Lesson_37_Mnogopotochnost;

public class Test_37_02_Runnable {
    public static void main (String[]args){
        SecondThread task = new SecondThread();
        Thread thread = new Thread(task);
        thread.start();
    }

    public static class SecondThread implements Runnable{

        @Override
        public void run() {
            System.out.println("Run");
        }
    }
}
івааіфва
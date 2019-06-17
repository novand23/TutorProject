package com.company.Lesson_23_Exception_02;

import java.io.IOException;
import java.rmi.RemoteException;

/* Перехват checked исключений
В методе processExceptions обработайте все checked исключения.
IOException
RemoteException
NoSuchFieldException
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..*/
public class Test_23_03 {
    public static void main(String[] args) throws IOException, NoSuchFieldException {
        try {
            processExceptions();
        } catch (RemoteException e) {
            System.out.println("RemoteException");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException");
        } catch (IOException e) {
            System.out.println("IOException");

        }
    }

    private static void processExceptions() throws IOException, NoSuchFieldException {
        int i = (int) (Math.random() * 3);

        if (i == 0) {
            throw new IOException();
        }
        if (i == 1) {
            throw new RemoteException();
        }
        if (i == 2) {
            throw new NoSuchFieldException();
        }

    }

}


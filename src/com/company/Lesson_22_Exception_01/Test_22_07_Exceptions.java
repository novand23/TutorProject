package com.company.Lesson_22_Exception_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

/* Исключения
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException.
*/
public class Test_22_07_Exceptions {
    public static void main(String[] args) throws IOException, URISyntaxException {
        try {
            throwingException();
        } catch (NullPointerException e) {

        } catch (FileNotFoundException e){


        }
    }

    private static void throwingException() throws IOException, URISyntaxException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 4");
        int i = Integer.parseInt(bf.readLine());

        if (i == 1) {
            throw new NullPointerException();
        }
        if (i == 2) {
            throw new ArithmeticException();
        }
        if (i == 3) {
            throw new FileNotFoundException();
        }
        if (i == 4) {
            throw new URISyntaxException("", "");

        }


    }

}

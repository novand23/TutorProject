package com.company.Lesson_24_Potoki;

import java.io.*;

/*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/
public class Test_24_01 {
    public static void main (String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = bf.readLine();
        String targetFileName = bf.readLine();

        InputStream inputStream = new FileInputStream(sourceFileName);
        OutputStream outputStream = new FileOutputStream(targetFileName);

        int count = 0;
        while (inputStream.available()>0){
            int data = inputStream.read();
            outputStream.write(data);
            count++;
        }
        System.out.println(count);

        inputStream.close();
        outputStream.close();
    }

}

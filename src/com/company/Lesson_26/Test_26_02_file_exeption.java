package com.company.Lesson_26;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/
public class Test_26_02_file_exeption {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите имя файла: ");
                String fileName1 = bf.readLine();
                InputStream inputStream = new FileInputStream(fileName1);
                String fileName2 = bf.readLine();
                OutputStream outputStream = new FileOutputStream(fileName2);
                int count = 0;
                while (inputStream.available()>0){
                    int data = inputStream.read();
                    outputStream.write(data);
                    count++;

                }
                System.out.println(count);

                inputStream.close();
                outputStream.close();
                break;

            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует!");
                System.out.println("Проверьте правильность написания имени файла и введите повторно: ");
            }

        }





    }
}

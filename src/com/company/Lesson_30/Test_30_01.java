package com.company.Lesson_30;

import java.io.*;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/
public class Test_30_01 {
    public static void main(String [] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream;

        while (true){
            try {
                System.out.println("Введите имя файла: ");
                String s = bf.readLine();
                inputStream = new FileInputStream(s);

                break;

            } catch (FileNotFoundException e){
                System.out.println("Файл не существует!");
                System.out.println("Проверьте правильность написания имени файла и введите повторно: ");
            }


        }

        while (inputStream.available()>0){
            System.out.print(((char)inputStream.read()));
        }
        inputStream.close();
    }
}

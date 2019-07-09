package com.company.Lesson_30;

import java.io.*;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
public class Test_30_02 {
    public static void main (String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Введите имя файла: ");
        String s = bf.readLine();
        OutputStream outputStream = new FileOutputStream(s);

        while (true){
            System.out.println("Enter text: ");
            String text = bf.readLine();
            if (text.equals("exit")){
                break;
            }
            outputStream.write((text + "\n").getBytes());
        }

    }

}

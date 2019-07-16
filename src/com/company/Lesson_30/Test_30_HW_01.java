/*
package com.company.Lesson_30;
*/
/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*//*


import java.io.*;
import java.util.ArrayList;

public class Test_30_HW_01 {
    public static void main (String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream;
        ArrayList<Integer> arr = new ArrayList<>();

        while (true){
            try {
                System.out.println("Введите имя файла: ");
                String s = bf.readLine();
                inputStream = new FileInputStream(s);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует!");
                System.out.println("Проверьте правильность написания имени файла и введите повторно: ");

            }
        }

        while ()


            }
        }


    }
}
*/

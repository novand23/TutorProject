package com.company.Lesson_23_Exception_02;
/* Перехватывание исключений
1. Есть три исключения последовательно унаследованные от Exception:
2. class Exception1 extends  Exception
3. class Exception2 extends  Exception1
4. class Exception3 extends  Exception2
5. Есть метод, который описан так:
5.1. public static void method1() throws Exception1, Exception2, Exception3

6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
*/
public class Test_23_01 {
    public static void main (String[]args){
       try {
           throwingException();

       } catch (Exception e) {
           System.out.println("e");
       }
    }

    private static void throwingException() throws Exception {
        int i = (int) (Math.random()*4);

        if (i == 0) {
            throw new Exception();
        }
        if (i == 1) {
            throw new Exception1();
        }
        if (i == 2) {
            throw new Exception2();
        }
        if (i == 3) {
            throw new Exception3();
    }
}


static class Exception1 extends  Exception{}
static class Exception2 extends  Exception1{}
static class Exception3 extends  Exception2{}
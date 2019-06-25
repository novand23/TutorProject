package com.company.Lesson_27_OOP;
/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
В классе Horse создать переменные name, flyable, runnable
Созать конструктор для всех переменных класса Horse
В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
- если переменная true, My name is + this.name + , i can fly =)
- если переменная false, My name is + this.name + , i cant fly =(
Унаследовать пегаса от лошади.
В методе main создать два объекта: horse и pegas
Подумать, какие значения присваивать переменным определенного класса.
*/
public class Test_27_02_ {
    public static void main (String[]args) {
        Horse horse = new Horse("Lola", false, true);
        Horse pegas = new Pegas("Rembo", true, false);
        System.out.println(horse.toString());
        System.out.println(pegas.toString());
    }
}
class Horse{
    private String name;
    private boolean flyable;
    private boolean runnable;

    public Horse (String name, boolean flyable, boolean runnable){
        this.name = name;
        this.flyable = runnable;
        this.runnable = runnable;
    }

    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isFlyable (){
        return flyable;
    }
    public void setFlyable(boolean flyable){
        this.flyable = flyable;
    }
    public boolean isRunnable (){
        return runnable;
    }
    public void setRunnable (boolean runnable){
        this.runnable = runnable;
    }

    public String toString(){
        String text = "";
        text += "My name is " + this.name + ", " + (this.flyable ? "i can fly =)" : "i cant fly =(");
        return text;

    }
}
class Pegas extends Horse{
    public Pegas (String name, boolean flyable, boolean runnable) {
        super(name, flyable, runnable);

    }


}

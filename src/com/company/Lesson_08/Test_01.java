package com.company.Lesson_08;

/*
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Test_01 {
    public static void main(String[] args) {

        Human gf1 = new Human("Pedro", true, 82, null, null);
        Human gm1 = new Human("Monika", false, 80, null, null);
        Human gf2 = new Human("Pol", true, 85, null, null);
        Human gm2 = new Human("Karina", false, 77, null, null);
        Human fother = new Human("Igor", true, 52, gf1, gm1);
        Human mother = new Human("Toma", false, 45, gf2, gm2);
        Human child = new Human("Roma", true, 22, fother, mother);
        gf1.setFather(fother);
        gf2.setFather(fother);
        gm1.setFather(fother);
        gm2.setFather(fother);

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(fother);
        System.out.println(mother);
        System.out.println(child);
    }
}

class Human {
    private String name;
    private boolean gender;
    private int age;
    private Human father;
    private Human mother;

    /*public Human(String name, boolean man, int age) {
        this.name = name;
        this.gender = man;
        this.age = age;
    }
*/
    public Human(String name, boolean man, int age, Human father, Human mother) {
        this.name = name;
        this.gender = man;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMather() {
        return mother;
    }

    public void setMather(Human mother) {
        this.mother = mother;
    }


    public String toString() {
        return String.format("\nName: %s, gender: %s, age %d, father: %s, mother: %s", getName(), getGender(), getAge(), getFather().getName(), getMather().getName());
    }

    
}
package com.company.War_Robot;

/* Битва роботов
1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable и абстрактный класс AbstractRobot
2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 Сделать объекты неизменяемыми.
3. В интерфейсе Attackable создать метод BodyPart attack();
4. В интерфейсе Defensable создать метод BodyPart defense();
5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable
6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/
public class Robot_Battle {
    public static void main(String[] args) {
        Robot r1 = new Robot("Ураган");
        Robot r2 = new Robot("Сатурн");

        doMove(r1, r2);
        doMove(r2, r1);
        doMove(r1, r2);
        doMove(r2, r1);
        doMove(r1, r2);
        doMove(r2, r1);

    }

    public static void doMove (AbstractRobot robotFirst, AbstractRobot robotSecond){
        BodyPart att = robotFirst.attack();
        BodyPart def = robotSecond.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), att, def));
    }

}

class BodyPart {
    String bodyPart;
    final static BodyPart arm = new BodyPart("Рука");
    final static BodyPart leg = new BodyPart("Нога");
    final static BodyPart head = new BodyPart("Голова");
    final static BodyPart chest = new BodyPart("Грудь");

    public BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}

interface Attackable {
    BodyPart attack();

}

interface Defensable {
    BodyPart defense();

}

abstract class AbstractRobot implements Attackable, Defensable {

    private String name;
    private static int hitCount;

    public AbstractRobot(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHitCount() {
        return hitCount;
    }

    public static void setHitCount(int hitCount) {
        AbstractRobot.hitCount = hitCount;
    }

    @Override
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = (int) (Math.random() * 4);
        if (hitCount == 0) {
            attackedBodyPart = BodyPart.arm;
        } else if (hitCount == 1) {
            attackedBodyPart = BodyPart.leg;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.head;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.chest;
        }
        return attackedBodyPart;
    }

    @Override
    public BodyPart defense() {
        BodyPart defenseBodyPart = null;
        hitCount = (int) (Math.random() * 4);
        if (hitCount == 0) {
            defenseBodyPart = BodyPart.arm;
        } else if (hitCount == 1) {
            defenseBodyPart = BodyPart.leg;
        } else if (hitCount == 2) {
            defenseBodyPart = BodyPart.head;
        } else if (hitCount == 3) {
            defenseBodyPart = BodyPart.chest;
        }
        return defenseBodyPart;
    }

}
class Robot extends AbstractRobot {

    public Robot(String name) {
        super(name);
    }
}
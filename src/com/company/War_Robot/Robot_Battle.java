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

        Robot r1 = new Robot("Юпитер");
        Robot r2 = new Robot("Сатурн");

        doMove(r1, r2);
        doMove(r2, r1);
        doMove(r1, r2);
        doMove(r2, r1);
        doMove(r1, r2);
        doMove(r2, r1);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart att = robotFirst.attack();
        BodyPart def = robotSecond.defense();
        int damage = robotFirst.damage(att);
        int a = robotSecond.getHp(damage);


        if (att == def) {
            System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s, удар успешно заблокирован!",
                    robotFirst.getName(), robotSecond.getName(), att, def));
        /*} else if (a <= 0) {
            System.out.println(String.format("Робот %s нанес решающий удар опоненту, это победа!", robotFirst.getName()));
            System.exit(0);*/
        } else {
            System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s, нанесено урона (%d), осталось жизней [%d].",
                    robotFirst.getName(), robotSecond.getName(), att, def, damage, a));
        }




    }

    static class BodyPart {
        String bodyPart;
        public final static BodyPart ARM = new BodyPart("Рука");
        public final static BodyPart LEG = new BodyPart("Нога");
        public final static BodyPart HEAD = new BodyPart("Голова");
        public final static BodyPart CHEST = new BodyPart("Грудь");

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

    abstract static class AbstractRobot implements Attackable, Defensable {

        private static int hitCount;
        private String name;
        private int hp = 5;


        public AbstractRobot(String name) {
            this.name = name;
        }

        public int getHp(int a) {
            hp = hp - a;
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
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
                attackedBodyPart = BodyPart.ARM;
            } else if (hitCount == 1) {
                attackedBodyPart = BodyPart.LEG;
            } else if (hitCount == 2) {
                attackedBodyPart = BodyPart.HEAD;
            } else if (hitCount == 3) {
                attackedBodyPart = BodyPart.CHEST;
            }
            return attackedBodyPart;
        }

        @Override
        public BodyPart defense() {
            BodyPart defenseBodyPart = null;
            hitCount = (int) (Math.random() * 4);
            if (hitCount == 0) {
                defenseBodyPart = BodyPart.ARM;
            } else if (hitCount == 1) {
                defenseBodyPart = BodyPart.LEG;
            } else if (hitCount == 2) {
                defenseBodyPart = BodyPart.HEAD;
            } else if (hitCount == 3) {
                defenseBodyPart = BodyPart.CHEST;
            }
            return defenseBodyPart;
        }

        public int damage(BodyPart bodyPart) {
            int damage = 0;
            if (bodyPart == BodyPart.ARM) {
                damage = (int) (1 + Math.random() * 2);
            } else if (bodyPart == BodyPart.LEG) {
                damage = (int) (1 + Math.random() * 2);
            } else if (bodyPart == BodyPart.HEAD) {
                damage = (int) (1 + Math.random() * 5);
            } else if (bodyPart == BodyPart.CHEST) {
                damage = (int) (1 + Math.random() * 3);
            }
            return damage;
        }
    }

    static class Robot extends AbstractRobot {

        public Robot(String name) {
            super(name);
        }

    }
}

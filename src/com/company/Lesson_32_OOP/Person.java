package com.company.Lesson_32_OOP;

public interface Person {
    class User implements Person {
        public void live() {
            System.out.println("Usually I just live.");
        }
    }

    class Looser implements Person {
        public void doNothing() {
            System.out.println("Usually I do nothing.");
        }
    }

    class Coder implements Person {
        public void coding() {
            System.out.println("Usually I create code.");
        }
    }

    class Proger implements Person {
        public void enjoy() {
            System.out.println("Wonderful life!");
        }
    }
}

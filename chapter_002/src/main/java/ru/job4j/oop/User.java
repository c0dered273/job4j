package ru.job4j.oop;

public class User {
    private String name; // поле объекта, объявляется в описании класса
    private int age; // поле объетка, объявляется в описании класса

    public boolean canDrive() {
        boolean can = false; // локальная переменная, объявляется в методе
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
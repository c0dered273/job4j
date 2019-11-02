package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int fact = 1;
        for (int index = 1; index <= n; index++) {
            fact *= index;
        }
        return fact;
    }
}

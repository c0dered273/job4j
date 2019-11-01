package ru.job4j.loop;

public class Factorial {

    public int calc(int n) {
        int fact = 1;
        if (n == 0) return fact;
        for (int index = 1; index <= n; index++) {
            fact *= index;
        }
        return fact;
    }
}

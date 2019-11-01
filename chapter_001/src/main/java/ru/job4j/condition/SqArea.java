package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
//        return Math.pow(((double) p / (2*k + 2)), 2) * k;
        int h = p / (2 * (k + 1));
        int w = k * h;
        int s = w * h;
        return s;
    }
}

package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        System.out.println("result (0, 0) to (2, 2) " + distance(0, 0, 2, 2));
        System.out.println("result (1, 3) to (10, 6) " + distance(1, 3, 10, 6));
        System.out.println("result (0, 0) to (96, 32) " + distance(0, 0, 96, 32));
        System.out.println("result (35, 71) to (2, 2) " + distance(35, 71, 2, 2));
    }
}

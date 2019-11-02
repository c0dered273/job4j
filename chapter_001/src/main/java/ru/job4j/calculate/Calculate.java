package ru.job4j.calculate;

/**
 * Calculate
 * @author Oleg Kaschuk (okaschuk@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculate {
    /**
     * Calculate adding
     * @param first  first item
     * @param second  second item
     */
    public static void add(double first, double second) {
        System.out.println(first + " + " + second + " = " + (first + second));
    }

    /**
     * Calculate subtract
     * @param first  first item
     * @param second second item
     */
    public static void subtract(double first, double second) {
        System.out.println(first + " - " + second + " = " + (first - second));
    }

    /**
     * Calculate multiply
     * @param first first item
     * @param second second item
     */
    public static void multiply(double first, double second) {
        System.out.println(first + " * " + second + " = " + (first * second));
    }

    /**
     * Calculate division
     * @param first first item
     * @param second second item
     */
    public static void div(double first, double second) {
        System.out.println(first + " / " + second + " = " + (first / second));
    }

    /**
     * Main
     * @param args args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}

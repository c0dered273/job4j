package ru.job4j.calculate;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(186);
        System.out.printf("Man 186 is %.1f \n", man);
        double woman = womanWeight(168);
        System.out.printf("Woman 168 is %.1f \n", woman);
    }

}

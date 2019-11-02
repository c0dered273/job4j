package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        double rate = (1 + (percent / 100));
        double yearBalance = amount * rate;
        while (yearBalance > salary) {
            yearBalance -= salary;
            yearBalance = yearBalance * rate;
            year++;
        }
        return year;
    }
}

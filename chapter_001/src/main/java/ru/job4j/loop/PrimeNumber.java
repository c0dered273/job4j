package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        CheckPrimeNumber isPrime = new CheckPrimeNumber();
        for (int i = 2; i <= finish; i++) {
           if (isPrime.check(i)) {
               count++;
           }
        }
        return count;
    }
}

package ru.job4j.condition;

public class Max {

    static int max(int first, int second) {
        return first > second ? first : second;
    }

    static int max(int first, int second, int third) {
        return max(third, max(first, second));
    }
}

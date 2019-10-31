package ru.job4j.condition;

public class MultiMax {

    public int max(int first, int second, int third) {
        int result = first;
        result = result < second ? second : result;
        result = result < third ? third : result;
        return result;
    }
}

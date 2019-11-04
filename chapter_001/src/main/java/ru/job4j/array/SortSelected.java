package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int min = 0;
        int index = 0;
        int temp = 0;
        for (int i = 0; i != data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length - 1);
            index = FindLoop.indexOf(data, min, i, data.length - 1);
            temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }
}

package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        char[] ch1 = o1.toCharArray();
        char[] ch2 = o2.toCharArray();
        int minLength = Math.min(ch1.length, ch2.length);
        for (int i = 0; i != minLength; i++) {
            result = Character.compare(ch2[i], ch1[i]);
            if (result != 0) return result;
        }
        return  o2.length() - o1.length();
    }
}

package ru.job4j.collection;

import java.util.Comparator;

public class UserDesc {

    public static Comparator<User> byNameNatural() {
        return new NameNaturalOrder();
    }

    public static Comparator<User> byNameReverse() {
        return new NameReverseOrder();
    }

    public static Comparator<User> byAgeNatural() {
        return new AgeNaturalOrder();
    }

    public static Comparator<User> byAgeReverse() {
        return new AgeReverseOrder();
    }

    private static class NameNaturalOrder implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private static class NameReverseOrder implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }

    private static class AgeNaturalOrder implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    private static class AgeReverseOrder implements Comparator<User> {

        @Override
        public int compare(User o1, User o2) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}

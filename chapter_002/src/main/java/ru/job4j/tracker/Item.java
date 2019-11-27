package ru.job4j.tracker;

public class Item {
    public Item() {
        System.out.println("load item");
    }

    public static void main(String[] args) {
        Item item = new Item();
        Bug bug = new Bug();
    }
}

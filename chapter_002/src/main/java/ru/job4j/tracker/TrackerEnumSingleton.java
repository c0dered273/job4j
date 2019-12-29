package ru.job4j.tracker;

import java.util.ArrayList;

public enum TrackerEnumSingleton {
    INSTANCE;

    private static final Tracker TRACKER = new Tracker();

    public Item add(Item item) {
        return TRACKER.add(item);
    }

    public boolean replace(String id, Item item) {
        return TRACKER.replace(id, item);
    }

    public boolean delete(String id) {
        return TRACKER.delete(id);
    }

    public ArrayList<Item> findAll() {
        return TRACKER.findAll();
    }

    public ArrayList<Item> findByName(String key) {
        return TRACKER.findByName(key);
    }

    public Item findById(String id) {
        return TRACKER.findById(id);
    }
}

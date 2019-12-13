package ru.job4j.tracker;

public class TrackerStaticFieldSingleton {

    private static TrackerStaticFieldSingleton instance;
    private static final Tracker tracker = new Tracker();

    private TrackerStaticFieldSingleton() {
    }

    public static TrackerStaticFieldSingleton getInstance() {
        if (instance == null) {
            instance = new TrackerStaticFieldSingleton();
        }
        return  instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public boolean replace(String id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(String id) {
        return tracker.delete(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public Item findById(String id) {
        return tracker.findById(id);
    }
}

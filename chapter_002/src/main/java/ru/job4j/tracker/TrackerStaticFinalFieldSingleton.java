package ru.job4j.tracker;

public class TrackerStaticFinalFieldSingleton {

    private static final TrackerStaticFinalFieldSingleton INSTANCE
            = new TrackerStaticFinalFieldSingleton();
    private static final Tracker TRACKER = new Tracker();

    private TrackerStaticFinalFieldSingleton() {
    }

    public static TrackerStaticFinalFieldSingleton getInstance() {
        return INSTANCE;
    }

    public Item add(Item item) {
        return TRACKER.add(item);
    }

    public boolean replace(String id, Item item) {
        return TRACKER.replace(id, item);
    }

    public boolean delete(String id) {
        return TRACKER.delete(id);
    }

    public Item[] findAll() {
        return TRACKER.findAll();
    }

    public Item[] findByName(String key) {
        return TRACKER.findByName(key);
    }

    public Item findById(String id) {
        return TRACKER.findById(id);
    }
}

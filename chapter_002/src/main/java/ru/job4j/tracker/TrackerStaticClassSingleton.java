package ru.job4j.tracker;

public class TrackerStaticClassSingleton {

    private static final Tracker tracker = new Tracker();

    private TrackerStaticClassSingleton() {
    }

    private static final class SingletonHolder {
        private static final TrackerStaticClassSingleton INSTANCE
                = new TrackerStaticClassSingleton();
    }

    public static TrackerStaticClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
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

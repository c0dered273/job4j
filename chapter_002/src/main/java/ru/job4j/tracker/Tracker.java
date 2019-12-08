package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Редактирует заявку
     * @param id Уникальный идентификатор заявки
     * @param item Заявка
     * @return Результат операции
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = this.indexById(id);
        if (index != -1) {
            String oldId = this.items[index].getId();
            item.setId(oldId);
            this.items[index] = item;

            result = true;
        }
        return result;
    }

    /**
     * Удаляет заявку
     * @param id Уникальный идентификатор заявки
     * @return Результат операции
     */
    public boolean delete(String id) {
        boolean result = false;
        int indexById = this.indexById(id);
        if (indexById != -1) {
            System.arraycopy(this.items, indexById + 1, this.items, indexById, this.position - 1);
            this.items[position - 1] = null;
            position--;
            result = true;
        }
        return result;
    }

    /**
     * Выводит все заявки
     * @return Массив заявок без null
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Ищет заявки по имени
     * @param key Имя заявки
     * @return Массив заявок или пустой массив
     */
    public Item[] findByName(String key) {
        int fndEnt = 0;
        Item[] result = new Item[position];
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                result[fndEnt++] = this.items[i];
            }
        }
        return Arrays.copyOf(result, fndEnt);
    }

    /**
     * Ищет заявки по ID
     * @param id Идентификатор
     * @return Заявка или null
     */
    public Item findById(String id) {
        int index = this.indexById(id);
        if (index != -1) {
            return this.items[index];
        }
        return null;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Ищет индекс массива с заданным Id
     * @param id Идентификатор
     * @return Индекс массива или -1 если такого элемента нет
     */
    private int indexById(String id) {
        int result = -1;
        for (int index = 0; index < this.position; index++) {
            if (this.items[index].getId().equals(id)) {
                result = index;
                break;
            }
        }
        return result;
    }
}

package ru.job4j.tracker;

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
            for (int i = indexById; i < this.position - 1; i++) {
                this.items[i] = this.items[i + 1];
            }
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
        Item[] result = null;
        if (position > 0) {
            result = new Item[position];
            System.arraycopy(this.items, 0, result, 0, position);
        }
        return result;
    }

    /**
     * Ищет заявки по имени
     * @param key Имя заявки
     * @return Массив заявок или null
     */
    public Item[] findByName(String key) {
        int locPos = 0;
        int[] resultIndexes = new int[100];
        for (int i = 0; i < this.position; i++) {
            if (items[i].getName().equals(key)) {
                resultIndexes[locPos++] = i;
            }
        }
        if (locPos == 0) {
            return null;
        }
        Item[] result = new Item[locPos];
        for (int i = 0; i < locPos; i++) {
            result[i] = this.items[resultIndexes[i]];
        }
        return result;
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
        if (this.position > 0) {
            for (int index = 0; index < this.position; index++) {
                if (this.items[index].getId().equals(id)) {
                    result = index;
                    break;
                }
            }
        }
        return result;
    }
}

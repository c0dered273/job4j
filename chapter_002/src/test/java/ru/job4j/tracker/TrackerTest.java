package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2");
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void replaceWithNonExistId() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Test"));
        boolean result = tracker.replace("0", new Item("NonExist"));
        assertThat(result, is(false));
    }

    @Test
    public void deleteItemTest() {
        Tracker tracker = new Tracker();
        Item[] ref = new Item[6];
        Item delItem = new Item("delItem");
        Item test1 = new Item("Test1");
        Item test2 = new Item("Test2");
        Item test3 = new Item("Test3");
        Item test4 = new Item("Test4");
        Item test5 = new Item("Test5");
        Item test6 = new Item("Test6");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(delItem);
        tracker.add(test4);
        tracker.add(test5);
        tracker.add(test6);
        tracker.delete(delItem.getId());
        ref[0] = test1;
        ref[1] = test2;
        ref[2] = test3;
        ref[3] = test4;
        ref[4] = test5;
        ref[5] = test6;
        Item[] result = tracker.findAll();
        assertThat(result, is(ref));
    }

    @Test
    public void deleteWithNonExistId() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Test"));
        boolean result = tracker.delete("0");
        assertThat(result, is(false));
    }

    @Test
    public void findAllWithEmptyArray() {
        Tracker tracker = new Tracker();
        Item[] result = tracker.findAll();
        assertThat(result, is(nullValue()));
    }

    @Test
    public void findByNameTest() {
        Tracker tracker = new Tracker();
        Item[] ref = new Item[3];
        Item test1 = new Item("Test1");
        Item test2 = new Item("Test2");
        Item test3 = new Item("Test2");
        Item test4 = new Item("Test4");
        Item test5 = new Item("Test5");
        Item test6 = new Item("Test2");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(test4);
        tracker.add(test5);
        tracker.add(test6);
        ref[0] = test2;
        ref[1] = test3;
        ref[2] = test6;
        Item[] result = tracker.findByName("Test2");
        assertThat(result, is(ref));
    }

    @Test
    public void findByNameNonExist() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("Test1");
        Item test2 = new Item("Test2");
        Item test3 = new Item("Test3");
        Item test4 = new Item("Test4");
        Item test5 = new Item("Test5");
        Item test6 = new Item("Test6");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        tracker.add(test4);
        tracker.add(test5);
        tracker.add(test6);
        Item[] result = tracker.findByName("NonExist");
        assertThat(result, is(nullValue()));
    }

    @Test
    public void findByIdNonExist() {
        Tracker tracker = new Tracker();
        Item test1 = new Item("Test1");
        Item test2 = new Item("Test2");
        Item test3 = new Item("Test3");
        tracker.add(test1);
        tracker.add(test2);
        tracker.add(test3);
        Item result = tracker.findById("0");
        assertThat(result, is(nullValue()));
    }

}
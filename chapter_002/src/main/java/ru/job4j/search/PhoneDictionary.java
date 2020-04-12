package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> checkName = i -> i.getName().contains(key);
        Predicate<Person> checkSurname = i -> i.getSurname().contains(key);
        Predicate<Person> checkPhone = i -> i.getPhone().contains(key);
        Predicate<Person> checkAddress = i -> i.getAddress().contains(key);
        Predicate<Person> combine = checkName.or(checkSurname.or(checkPhone.or(checkAddress)));
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

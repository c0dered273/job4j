package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class UserDescTest {

    @Test
    public void whenSortByNameNatural() {
        int result = UserDesc.byNameNatural().compare(new User("Petr", 32),
                new User("Ivan", 34));
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenSortByNameReverse() {
        int result = UserDesc.byNameReverse().compare(new User("Petr", 32),
                new User("Ivan", 34));
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenSortByAgeNatural() {
        int result = UserDesc.byAgeNatural().compare(new User("Petr", 32),
                new User("Ivan", 34));
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenSortByAgeReverse() {
        int result = UserDesc.byAgeReverse().compare(new User("Petr", 32),
                new User("Ivan", 34));
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenSortByNameThenSortByAge() {
        Comparator<User> cmp = UserDesc.byNameNatural().thenComparing(UserDesc.byAgeNatural());
        int result = cmp.compare(new User("Petr", 32),
                new User("Petr", 34));
        assertThat(result, lessThan(0));
    }

}

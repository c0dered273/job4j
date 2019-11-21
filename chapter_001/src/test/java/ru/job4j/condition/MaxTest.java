package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax24To14Then24() {
        int result = Max.max(24, 14);
        assertThat(result, is(24));
    }

    @Test
    public void whenMax44To44Then44() {
        int result = Max.max(44, 44);
        assertThat(result, is(44));
    }

    @Test
    public void whenMax3items1() {
        int result = Max.max(10, 2, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax3items2() {
        int result = Max.max(4, 14, 8);
        assertThat(result, is(14));
    }

    @Test
    public void whenMax3items3() {
        int result = Max.max(44, 44, 89);
        assertThat(result, is(89));
    }
}

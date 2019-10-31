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
}

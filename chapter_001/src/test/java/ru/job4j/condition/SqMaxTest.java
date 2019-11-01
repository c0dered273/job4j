package ru.job4j.condition;


import org.junit.Test;
import org.hamcrest.core.Is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenMax1() {
        int result = SqMax.max(5, 2, 1, 4);
        assertThat(result, Is.is(5));
    }

    @Test
    public void whenMax2() {
        int result = SqMax.max(25, 29, 4, 18);
        assertThat(result, Is.is(29));
    }

    @Test
    public void whenMax3() {
        int result = SqMax.max(56, 98, 123, 6);
        assertThat(result, Is.is(123));
    }

    @Test
    public void whenMax4() {
        int result = SqMax.max(49, 0, 154, 409);
        assertThat(result, Is.is(409));
    }
}

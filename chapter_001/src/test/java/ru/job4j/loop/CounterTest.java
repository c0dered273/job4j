package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }

    @Test
    public void whenSumEvenNumbersFrom1024To1029Then3078() {
        Counter counter = new Counter();
        int result = counter.add(1024, 1029);
        assertThat(result, is(3078));
    }
}

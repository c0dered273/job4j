package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void factorialOf5expect120() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void factorialOf12expect479001600() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(12);
        assertThat(result, is(479001600));
    }
}

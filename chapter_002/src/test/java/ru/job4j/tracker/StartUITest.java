package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"2"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] { new StubAction(),
                new StubAction(),
                action,
                new StubAction(),
        });
        assertThat(action.isCall(), is(true));
    }
}
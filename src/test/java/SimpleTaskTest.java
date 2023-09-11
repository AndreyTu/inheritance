import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTaskTest {
    @Test
    public void shouldSimpleTasksMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Сходить в магазин");


        boolean actual = simpleTask.matches("Сходить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSimpleTasksNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Сходить в магазин");


        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

}
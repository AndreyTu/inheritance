import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {


    @Test
    public void shouldEpicTasksMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить кетчуп");


        boolean actual = simpleTask.matches("кетчуп");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldEpicTasksNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить кетчуп");


        boolean actual = simpleTask.matches("мойонез");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

}
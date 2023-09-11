import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {


    public void shouldEpicTasksMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Купить кетчуп");


        boolean actual = simpleTask.matches("Купить");
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
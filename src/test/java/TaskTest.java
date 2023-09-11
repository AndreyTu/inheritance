import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void shouldSimpleTasksMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSimpleTasksNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        boolean actual = simpleTask.matches("Купить");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
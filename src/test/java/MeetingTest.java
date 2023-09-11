import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {

    @Test
    public void shouldMeetingTestMatches() {
        Meeting meet = new Meeting(1, "Пятница", "Лекция", "9:00");


        boolean actual = meet.matches("Лекция");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMeetingTestMatches2() {
        Meeting meet = new Meeting(2, "Пятница", "Лекция", "9:00");


        boolean actual = meet.matches("Пятница");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMeetingTestMatches3() {
        Meeting meet = new Meeting(3, "Пятница", "Лекция", "18:00");


        boolean actual = meet.matches("18:00");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMeetingTestNotMatches() {
        Meeting meet = new Meeting(4, "Пятница", "Лекция", "9:00");


        boolean actual = meet.matches("мойонез");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

}

import Smart.home.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


@Test
public void test() {
    Radio radio = new Radio(20);

    radio.setCurrentStation(15);

    int expected = 15;
    int actual = radio.getCurrentStation();
    Assertions.assertEquals(expected, actual);
}

@Nested
class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
}
















import Smart.home.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void test() {
    Radio radio = new Radio(20);

    radio.setCurrentStation(15);

    int expected = 15;
    int actual = radio.getCurrentStation();
    Assertions.assertEquals(expected, actual);
   }
}


    @Test
    public void test() {
    Radio radio = new Radio();

    radio.setCurrentStation(6);

    int expected = 6;
    int actual = radio.getCurrentStation();
    Assertions.assertEquals(expected, actual);
  }
}



















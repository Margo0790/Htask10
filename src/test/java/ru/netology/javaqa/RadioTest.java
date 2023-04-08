package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test

    public void shouldSetStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        Assertions.assertEquals(6, radio.getCurrentStation());
        radio.setCurrentStation(10);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test

    public void getCurrentStation() {
        Radio radio = new Radio();
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void getCurrentStation1() {
        Radio radio = new Radio();
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());

    }

    @Test

    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(50, radio.getCurrentVolume());
        radio.setCurrentVolume(101);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void getCurrentVolume1() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());

    }
}
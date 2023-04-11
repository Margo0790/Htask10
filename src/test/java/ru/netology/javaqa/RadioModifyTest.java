package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioModifyTest {

    @Test

    public void shouldSetStation() {

        RadioModify radio = new RadioModify();

        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
        radio.setCurrentStation(-1);
        Assertions.assertEquals(6, radio.getCurrentStation());
        radio.setCurrentStation(10);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test

    public void shouldTurnOnNextStation() {
        RadioModify radio = new RadioModify();
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void shouldTurnOnPreviousStation() {
        RadioModify radio = new RadioModify();
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());

    }

    @Test

    public void shouldSetVolume() {
        RadioModify radio = new RadioModify();

        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(50, radio.getCurrentVolume());
        radio.setCurrentVolume(101);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioModify radio = new RadioModify();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioModify radio = new RadioModify();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        Assertions.assertEquals(99, radio.getCurrentVolume());

    }

    @Test
    public void shouldSetCurrentStationWithArgument() {
        RadioModify radio = new RadioModify(12);

        Assertions.assertEquals(12, radio.getStationQuantity());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentStationWithoutArgument() {
        RadioModify radio = new RadioModify();
        Assertions.assertEquals(10, radio.getStationQuantity());
    }
}
package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void setCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(11);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(-1);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeEqualMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeEqualMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(9);

        int expected = 10;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeFromMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);

        int expected = 1;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeToMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(1);

        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);

        int expected = 9;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromMoreMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(12);

        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromLessMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(9);

        int expected = 8;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromLessMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void getVolumeMax() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(2);

        int expected = 10;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void getVolumeMin() {
        Radio radio = new Radio();

        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(2);

        int expected = 0;
        int actual = radio.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);

        radio.setCurrentStation(10);

        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBelowMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);

        radio.setCurrentStation(-1);

        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationEqualMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationEqualMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseStationToMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);

        int expected = 9;
        int actual = radio.increaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseStationEqualMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.increaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseStationFromMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);

        int expected = 1;
        int actual = radio.increaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationToMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(1);

        int expected = 0;
        int actual = radio.decreaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationEqualMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);

        int expected = 9;
        int actual = radio.decreaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationFromMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);

        int expected = 8;
        int actual = radio.decreaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationFromMoreMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);

        int expected = 9;
        int actual = radio.decreaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationLessMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);

        int expected = 7;
        int actual = radio.decreaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseStationLessMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.decreaseStation();
        assertEquals(expected, actual);
    }

    @Test
    public void getStationMax() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);

        int expected = 9;
        int actual = radio.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    public void getStationMin() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);

        int expected = 0;
        int actual = radio.getMinStation();
        assertEquals(expected, actual);
    }
}

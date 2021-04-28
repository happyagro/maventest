package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextCurrentStationTest(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.nextCurrentStation(3);
        assertEquals(4,radio.getCurrentStation());
        radio.setCurrentStation(9);
        radio.nextCurrentStation(9);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTest(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.prevCurrentStation(3);
        assertEquals(2,radio.getCurrentStation());
        radio.setCurrentStation(0);
        radio.prevCurrentStation(0);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTest(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(4);
        assertEquals(4,radio.getCurrentStation());
        radio.remoteCurrentStation(10);
        assertEquals(9,radio.getCurrentStation());
        radio.remoteCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void nextCurrentVolumeTest(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.nextCurrentVolume(3);
        assertEquals(4,radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        radio.nextCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTest(){
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(4);
        radio.prevCurrentVolume(3);
        assertEquals(2,radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

}
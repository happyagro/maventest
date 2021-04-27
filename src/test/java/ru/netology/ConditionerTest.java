package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void increaseCurrentTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature(20);
        assertEquals(21, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature(40);
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature(20);
        assertEquals(19, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature(10);
        assertEquals(10, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldChangeFieldTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        assertEquals(40,conditioner.getMaxTemperature());
        conditioner.setMinTemperature(10);
        assertEquals(10,conditioner.getMinTemperature());
        conditioner.setCurrentTemperature(30);
        conditioner.setCurrentTemperature(60);
        assertEquals(30, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(5);
        assertEquals(30, conditioner.getCurrentTemperature());
        conditioner.setOn(true);
        assertTrue(conditioner.isOn());
    }
}
package ru.itsjava.services;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Thing;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThingServiceImplTest {

     final List<String> listTest = new ArrayList();
    List<Thing> thingsFromStore = new ArrayList<>();


    @Test
    void takeThingByName() {

    }

    @Test
    void putThing() {


        //assertEquals(false, listTest.equals(""));
    }

    @Test
    void hashThing() {
        String temp = "temp";
        assertEquals(true, temp.equals("temp"));
        assertEquals(false, temp.equals(""));
    }

    @Test
    void printThing() {

        assertEquals("ddd", listTest.toString());
        listTest.add("Пока1");
        listTest.add("Пока2");
        listTest.add("Пока3");
        listTest.add("Пока4");
        assertEquals("List<Thing>{Пока1 Пока2 Пока3 Пока4 }", listTest.toString());
    }

    @Test
    void thingPriceSort() {
    }
}
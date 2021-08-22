package ru.itsjava.services;

import ru.itsjava.domain.Thing;

public interface ThingService {

    Thing takeThingByName(String name);

    void putThing(Thing thing);

    boolean hashThing(String name);

    void printThing();

    void thingPriceSort();
}

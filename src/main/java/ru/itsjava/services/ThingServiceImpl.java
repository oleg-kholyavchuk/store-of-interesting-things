package ru.itsjava.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Thing;

import java.util.Comparator;
import java.util.List;

@RequiredArgsConstructor
@Data
public class ThingServiceImpl implements ThingService {
    private final List<Thing> thingsFromStore;

    @Override
    public Thing takeThingByName(String name) {
        Thing resThing = null;
        for (Thing thing : thingsFromStore) {
            if (thing.getTitle().equals(name)) {
                resThing = thing;
            }
        }
        if (resThing != null) {
            thingsFromStore.remove(resThing);
            return resThing;
        }
        return null;
    }

    @Override
    public void putThing(Thing thing) {
        thingsFromStore.add(thing);
    }

    @Override
    public boolean hashThing(String name) {
        for (Thing thing : thingsFromStore) {
            if (thing.getTitle().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printThing() {
        for (Thing thing : thingsFromStore) {
            System.out.println(thing);
        }
    }

    public void thingPriceSort() {
        thingsFromStore.sort(new Comparator<Thing>() {

            @Override
            public int compare(Thing o1, Thing o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else return -1;
            }
        });
        for (int i = 0; i < thingsFromStore.toArray().length; i++) {
            System.out.println(thingsFromStore.get(i).getTitle() + " " + thingsFromStore.get(i).getAuthor());
        }
    }
}

package ru.itsjava.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Thing;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
@Data
public class ClientServiceImple implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final ThingService thingService;


    @Override
    public void buyThing() {
        System.out.println("Введите название вещи");
        String title = scanner.next();
        if (thingService.hashThing(title)) {
            System.out.println("Покупаем вещь.....");
            thingService.takeThingByName(title);
            System.out.println("Купили вещь");
        } else {
            System.out.println("Не смогли купить вещь...... Такой вещи нет : (");
        }
    }

    @Override
    public void putThing() {
        System.out.println("Введите название вещи");
        String title = scanner.next();

        System.out.println("Введите автора вещи");
        String author = scanner.next();

        System.out.println("Введите цену вещи");
        int price = scanner.nextInt();

        Thing thing = new Thing(title, author, price);

        thingService.putThing(thing);
    }

    @Override
    public void printThing() {
        System.out.println("Уважаймый клиент " + client.getName());
        System.out.println("Вот ваши вещи: ");
        thingService.printThing();
    }

    @Override
    public void thingPriceSort() {
        thingService.thingPriceSort();
    }
}

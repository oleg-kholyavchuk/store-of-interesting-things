package ru.itsjava.services;

import ru.itsjava.domain.Thing;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());


        List<Thing> thingList = new ArrayList<>();
        thingList.add(new Thing("Философия_Java", "Брюс_Эккель", 1_932));
        thingList.add(new Thing("Java_Полное_руководство", "Герберт_Шилдт", 3_115));
        thingList.add(new Thing("Чистый_код", "Роберт_Мартин", 718));

        ThingService thingService = new ThingServiceImpl(thingList);

        ClientService clientService = new ClientServiceImple(client, scanner, thingService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();
    }
}

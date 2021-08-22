package ru.itsjava.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
@Data
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.println("Вы выбрали купить ");
                clientService.buyThing();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали положить ");
                clientService.putThing();
            } else if (menuNum == 3) {
                System.out.println("Выводим название ");
                clientService.printThing();
            } else if (menuNum == 4) {
                System.out.println("Сортировать ");
                clientService.thingPriceSort();
            } else {
                System.out.println("До встречи в нашем магазине");
                break;
            }
        }
    }

    @Override
    public void printMenu() {
        System.out.print("Купить - 1 ");
        System.out.print("Отдать - 2 ");
        System.out.print("Выводим название - 3 ");
        System.out.print("Сортировать - 4 ");
        System.out.println("Все остальное цифры выход ");
    }
}

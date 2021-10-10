package ru.itpark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Store store = new Store();

        while (true) {
            System.out.println("Введите команду");
            System.out.println("a - Добавить продукт");
            System.out.println("l - вывести список продуктов");
            System.out.println("q - выход");

            String command = scanner.next();
            switch (command) {
                case "a":
                    System.out.println("Введите идентифиатор");
                    int id = scanner.nextInt();
                    System.out.println("Введите название");
                    String name = scanner.next();
                    System.out.println("Введите стоимость");
                    int price = scanner.nextInt();
                    store.add(new Product(id, name, price));
                    break;
                case "l":
                    System.out.println(store.getAll());
                    break;
                case "q":
                    return;
                default:
                    System.out.println("Комманда не распознана");
            }
        }
    }
}

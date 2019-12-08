package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                tracker.add(new Item(name));
            } else if (select == 1) {
                System.out.println("=== Show all items =======");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    this.printItem(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ============");
                System.out.print("Enter ID: ");
                String editId = scanner.nextLine();
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                Item newItem = new Item(newName);
                boolean result = tracker.replace(editId, newItem);
                if (result) {
                    System.out.println("OK");
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ==========");
                System.out.print("Enter ID: ");
                String delId = scanner.nextLine();
                boolean result = tracker.delete(delId);
                if (result) {
                    System.out.println("OK");
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by ID ======");
                System.out.print("Enter ID: ");
                String fndId = scanner.nextLine();
                Item result = tracker.findById(fndId);
                if (result != null) {
                    this.printItem(result);
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                Item[] result = tracker.findByName(itemName);
                if (result.length != 0) {
                    for (Item item : result) {
                        this.printItem(item);
                    }
                } else {
                    System.out.println("Items not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    private void printItem(Item item) {
        System.out.println("ID: " + item.getId() + "    " + "Name: " + item.getName());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

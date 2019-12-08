package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                tracker.add(new Item(name));
            } else if (select == 1) {
                System.out.println("=== Show all items =======");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    this.printItem(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ============");
                String editId = input.askStr("Enter ID: ");
                String newName = input.askStr("Enter new name: ");
                Item newItem = new Item(newName);
                boolean result = tracker.replace(editId, newItem);
                if (result) {
                    System.out.println("OK");
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ==========");
                String delId = input.askStr("Enter ID: ");
                boolean result = tracker.delete(delId);
                if (result) {
                    System.out.println("OK");
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by ID ======");
                System.out.print("Enter ID: ");
                String fndId = input.askStr("Enter ID: ");
                Item result = tracker.findById(fndId);
                if (result != null) {
                    this.printItem(result);
                } else {
                    System.out.println("Item not found");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                String itemName = input.askStr("Enter item name: ");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

package ru.job4j.tracker;

import java.util.ArrayList;

public class StartUI {

    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            run = actions.get(select).execute(input, tracker);
        }
    }

    private void showMenu(ArrayList<UserAction> actions) {
        int index = 0;
        System.out.println("Menu.");
        for (UserAction action : actions) {
            System.out.println(index + ". " + actions.get(index).name());
            index++;
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new FindAllAction());
        actions.add(new EditItemAction());
        actions.add(new DeleteItemAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        actions.add(new QuitAction());
        new StartUI().init(validate, tracker, actions);
    }
}

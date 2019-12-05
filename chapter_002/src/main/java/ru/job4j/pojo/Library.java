package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] library = new Book[4];
        library[0] = new Book("Head First Java", 718);
        library[1] = new Book("Clean code", 896);
        library[2] = new Book("Thinking in Java", 1232);
        library[3] = new Book("Effective Java", 693);
        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getName() + " - " + library[index].getPageCount() + " pages");
        }
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        System.out.println("Exchange 0-3");
        for (int index = 0; index < library.length; index++) {
            System.out.println(library[index].getName() + " - " + library[index].getPageCount() + " pages");
        }
        System.out.println("Print only Clean Code");
        for (int index = 0; index < library.length; index++) {
            if (library[index].getName().equals("Clean code") ) {
                System.out.println(library[index].getName() + " - " + library[index].getPageCount() + " pages");
            }
        }
    }
}

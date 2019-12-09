package ru.job4j.strategy;

public class Square implements Shape {

    @Override
    public String draw() {
        StringBuilder picture = new StringBuilder();
        picture.append("******");
        picture.append(System.lineSeparator());
        picture.append("******");
        picture.append(System.lineSeparator());
        picture.append("******");
        picture.append(System.lineSeparator());
        picture.append("******");
        picture.append(System.lineSeparator());
        picture.append("******");
        picture.append(System.lineSeparator());
        picture.append("******");
        return picture.toString();
    }
}

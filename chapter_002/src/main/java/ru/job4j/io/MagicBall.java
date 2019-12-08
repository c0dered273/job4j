package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner conInput = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = conInput.nextLine();
        String prophesy = "Может быть";
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            prophesy = "Да";
        } else if (answer == 1) {
            prophesy = "Нет";
        }
        System.out.println("Ответ: " + prophesy);
    }
}

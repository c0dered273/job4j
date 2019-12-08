package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        boolean pWins = false;
        Scanner conInput = new Scanner(System.in);
        System.out.println("Игра 11 спичек");
        while (!pWins) {
            System.out.println();
            System.out.println("Игрок 1");
            System.out.print("Выберите количество спичек (1-3) ");
            int pMatches = Integer.parseInt(conInput.nextLine());
            if (pMatches >= 1 && pMatches <= 3) {
                matches -= pMatches;
                System.out.println("Осталось спичек: " + matches);
                if (matches <= 0) {
                    pWins = true;
                    System.out.println("Игрок 1 победил");
                }
            }
            if (!pWins) {
                System.out.println();
                System.out.println("Игрок 2");
                System.out.print("Выберите количество спичек (1-3) ");
                pMatches = Integer.parseInt(conInput.nextLine());
                if (pMatches >= 1 && pMatches <= 3) {
                    matches -= pMatches;
                    System.out.println("Осталось спичек: " + matches);
                    if (matches <= 0) {
                        pWins = true;
                        System.out.println("Игрок 2 победил");
                    }
                }
            }
        }
    }
}

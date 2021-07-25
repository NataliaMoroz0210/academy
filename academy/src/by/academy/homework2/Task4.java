package by.academy.homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество игроков:");
        int n = Integer.parseInt(scan.nextLine());
        int np = 5;
        int numbercards = 52;
        if (n * np > numbercards || n <= 0) {
            System.out.println("Количество игроков введено некорректно.");
        } else {
            String[] carddesk = new String[52];
            String[] m = {"Пики", "Бубны", "Червы", "Трефы"};
            String[] d = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    carddesk[m.length * i + j] = d[i] + " " + m[j];
                }
            }
            for (int i = 0; i < numbercards; i++) {
                int r = i + (int) (Math.random() * (numbercards - i));
                String s = carddesk[r];
                carddesk[r] = carddesk[i];
                carddesk[i] = s;
            }
            for (int i = 0; i < n * np; i++) {
                if (i % np == 0) {
                    System.out.println();
                    System.out.println("Игрок " + ((i + 1)/5 + 1));
                }
                System.out.println(carddesk[i]);
            }
        }
    }
}
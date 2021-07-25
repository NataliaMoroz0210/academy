package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое слово, состоящее из чётного числа букв:");
        String word1 = scan.nextLine().trim();
        System.out.println("Введите второе слово, состоящее из чётного числа букв:");
        String word2 = scan.nextLine().trim();
        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("Введены слова не по запросу.");
        } else {
            String word3 = (word1.substring(0, word1.length() / 2)) + (word2.substring(word2.length() / 2));
            System.out.println(word3);
        }
    }
}

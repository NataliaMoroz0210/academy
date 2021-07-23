package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество слов:");
        int n = Integer.parseInt(scan.nextLine());
        String[] words = new String[n];
        String w1 = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово: ");
            words[i] = scan.nextLine();
        }
        int min = Integer.MAX_VALUE;
        for (String w : words) {
            int raz = 0;
            char[] wordschar = w.toCharArray();
            Arrays.sort(wordschar);
            char p = 0;
            for (char ch : wordschar) {
                if (ch != p) {
                    raz = raz + 1;
                    p = ch;
                }
            }
            if (raz < min) {
                min = raz;
                w1 = w;
            }
        }
        System.out.println("В слове " + w1 + " число различных символов минимально и равно " + min);
    }
}
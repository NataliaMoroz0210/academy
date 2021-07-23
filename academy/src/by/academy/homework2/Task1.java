package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = scan.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = scan.nextLine();
        scan.close();
        if (string1.length() != string2.length()) {
            System.out.println("false");
            return;
        }
        char[] arraystring1 = string1.toCharArray();
        char[] arraystring2 = string2.toCharArray();
        int raz1 = 0;
        int raz2 = 0;
        for (char value : arraystring1) {


            for (char c : arraystring2) {
                if (value == c) {
                    raz2 = raz2 + 1;
                    // System.out.println(raz2);
                }
            }
            for (char c : arraystring1) {
                if (c == value) {
                    raz1 = raz1 + 1;
                    // System.out.println(raz1);
                }
            }
        }

        if (raz1 == raz2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

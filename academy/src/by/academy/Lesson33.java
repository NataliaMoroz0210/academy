package by.academy;

import java.util.Scanner;

public class Lesson33 {   // Создайте число. Определите, является ли число четным или не четным,
    // вывести текстовое сообщение
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}

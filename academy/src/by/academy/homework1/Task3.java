package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) { //Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10:");
        int number;
        number = scan.nextInt();
        scan.close();
        if (number > 1 && number <= 10) {
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        } else {
            System.out.println("Введено число не по запросу");
        }
    }
}

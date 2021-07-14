package by.academy;

import java.util.Scanner;

public class Lesson35 { // Ввести с консоли 2 числа, найти большее, меньшее, среднее арифметическое.
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        scan.close();
        if (a==b){
            System.out.println("Число " + a + " равно числу " + b );
        } else if (a>b) {
            System.out.println("Число " + a + " большее, число " + b + " меньшее");
        } else {
            System.out.println("Число " + b + " большее, число " + a + " меньшее");
        }
        int c = (a + b) / 2;
        System.out.println("Среднее арифметическое: " + c);
    }
}

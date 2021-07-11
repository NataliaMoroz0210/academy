package by.academy;

import java.util.Scanner;

public class Lesson37 {
    public static void main(String[] args) { //  Ввести с клавиатуры 10 пар чисел. сравнить числа
                                             // в каждой паре и напечатать большие из них.
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Введите пару чисел");
            int n = scan.nextInt();
            int a = scan.nextInt();
            if (n==a){
                System.out.println(n + " и "+  a + " равны");
            }
            else if (n > a){
                System.out.println(n);
            } else {
                System.out.println(a);
            }
        }
        scan.close();
    }

    }

package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Lesson41 { //Ввести n строк с консоли, найти самую короткую и самую длинную строки.
    //Вывести найденные строки и их длину.
    public static void main(String[] args) {
        System.out.println("Введите количество строк:");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        scan.nextLine();
        String min = null;
        String max = null;

        for (int i = 0; i < k; i++) {
            System.out.println("Введите строку:");
            String str = scan.nextLine();
            if (min == null) {
                min = str;
            }
            if (max == null) {
                max = str;
            }
            if (str.length() < min.length()) {
                min = str;
            }
            if (str.length() > max.length()) {
                max = str;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        scan.close();


    }
}

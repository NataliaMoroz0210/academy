package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тип данных - int, double, float, char, String:");
        String type = scan.nextLine();
        System.out.println("Введите переменную:");
        switch (type) {
            case "int":
                int per1 = scan.nextInt();
                int ost = per1 % 2;
                System.out.println("Тип переменной int. Остаток от деления на 2 составляет:" + ost);
                break;
            case "double":
                double per2 = scan.nextDouble();
                double percent =  0.7 * per2;
                System.out.println("Тип переменной double. 70% от числа составляет:" + percent);
                break;
            case "float":
                float per3 = scan.nextFloat();
                float square = per3 * per3;
                System.out.println("Тип переменной float. Квадрат числа составляет:" + square);
                break;
            case "char":
                String per4 = scan.nextLine();
                int cod1;
                cod1 = per4.charAt(0);
                System.out.println("Тип переменной char. Код символа: " + cod1);
                break;
            case "String":
                String per5 = scan.nextLine();
                System.out.println("Hello " + per5);
                break;
            default:
                System.out.println("Unsupported type");
        }
        scan.close();
    }
}

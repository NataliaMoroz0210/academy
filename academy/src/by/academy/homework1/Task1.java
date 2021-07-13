package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
        public static void main(String[] args) {
        System.out.println("Введите сумму покупки в рублях:");
        Scanner scan = new Scanner(System.in);
        double sum = scan.nextDouble();
        System.out.println("Введите возраст покупателЯ:");
        int age = scan.nextInt();
        double finPrice;
        if (sum < 100) {
            finPrice = sum - sum * 0.05d;
        } else if (sum < 200) {
            finPrice = sum - sum * 0.07d;
        } else if (sum < 300) {
            if (age < 18) {
                finPrice = sum - sum * 0.16d;
            } else {
                finPrice = sum - sum * 0.09d;
            }
        } else if (sum < 400) {
            finPrice = sum - sum * 0.15d;
        } else {
            finPrice = sum - sum * 0.20d;
        }
        scan.close();
        System.out.println("Сумма с скидкой составляет:" + finPrice);

    }
}

package by.academy.classwork.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson36 {
        public static void main(String[] args) { // В сберкассу на трёхпроцентный вклад положили S рублей.
                                             // Какой станет сумма вклада через N лет.
        Random R = new Random();
        int S = Math.abs(R.nextInt(1000));
            System.out.println(S + " рублей положили в сберкассу");
            System.out.println("Введите сумму лет");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.close();
               for (int i = 0; i < n; i++) {
            S = (int) ((S * 0.03) +S);
        }
        System.out.println("Сумма вклада через " + n + " лет равна "+ S);



    }
}

package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) { // Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000.
        int number = 2;
        int res = 1;
        for (int i = 1;res < 1000000;i++) {
            res = res * number;
            System.out.println(number + " в степени " + i + " = " + res);
        }
    }
}

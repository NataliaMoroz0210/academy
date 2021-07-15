package by.academy.classwork.lesson3;

public class Lesson34 {
    // 4. Перепишите программу:
    // Продолжить пример, добавить расчет и вывод суток и недель. (месяц по желанию)
    public static class Main {
        public static void main(String[] args) {
            int s = 11370_556;
            int sec;
            int m;
            int min;
            int h;
            int hour;
            int d;
            int day;
            int w;
            int week;
            int m2;
            sec = s % 60;
            m = (s - sec) / 60;
            min = m % 60;
            h = (m - min) / 60;
            hour = h % 24;
            d = (h - hour) / 24;
            day = d % 7;
            w = (d - day) / 7;
            week = w % 4;
            m2 = (w - week) / 4;
            System.out.println(m2 + " месяцев " + week + " недель " + day + " суток " + hour + " часов " + min + " минут " + sec + " секунд");
        }
    }


}

package by.academy.homework4;

public class Main {
    public static void main(String[] args) {
        DateDemo main1 = new DateDemo("02-08-2017");
        DateDemo main2 = new DateDemo("25-11-2019");
        main1.printDayOfWeek();
        main2.printDayOfWeek();
        System.out.println("Количество дней между двумя датами " + DateDemo.dayBetween(main1, main2));
    }
}

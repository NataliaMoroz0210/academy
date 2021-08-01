package by.academy.homework3.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Дата сделки");
        String date = scan.nextLine();
        LocalDate date1;
        if (DateVerifier.verify(date)) {
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            try {
                date1 = LocalDate.parse(date, formatter1);
            } catch (Exception e) {
                date1 = LocalDate.parse(date, formatter2);
            }
        } else {
            System.out.println("Дата введена неверно");
            return;
        }

        Product[] products = new Product[100];
        int i = 0;

        while (true) {
            System.out.println("Введите 1 для добавления товара, введите 2 для удаления товара. Для завершения выбора введите 0.");
            String str0 = scan.nextLine();

          if (str0.equals("1")) {
              System.out.println("Введите вид товара - молоко, сыр, мясо.");
              String str1 = scan.nextLine();
              if (!str1.contains("молоко") && !str1.contains("сыр") && !str1.contains("мясо")) {
                  System.out.println("Введён неверный вид товара!");
                  continue;
              }
              System.out.println("Введите название товара:");
              String str2 = scan.nextLine();
              System.out.println("Введите цену товара:");
              int price = Integer.parseInt(scan.nextLine());
              System.out.println("Введите количество товара:");
              int count = Integer.parseInt(scan.nextLine());
              if (str1.contains("молоко")) {
                  System.out.println("Введите процент жирности молока:");
                  double fatcontent = Double.parseDouble(scan.nextLine());
                  System.out.println("Введите объём молока:");
                  double volume = Double.parseDouble(scan.nextLine());
                  products[i] = new Milk(str2, price, count, fatcontent, volume);
              } else if (str1.contains("сыр")) {
                  System.out.println("Введите возраст сыра:");
                  int age = Integer.parseInt(scan.nextLine());
                  System.out.println("Введите вид сыра:");
                  String kind = scan.nextLine();
                  products[i] = new Cheese(str2, price, count, age, kind);
              } else if (str1.contains("мясо")) {
                  System.out.println("Введите тип мяса:");
                  String type = scan.nextLine();
                  System.out.println("Введите вес мяса:");
                  double weight = Double.parseDouble(scan.nextLine());
                  products[i] = new Meat(str2, price, count, type, weight);
              }
              i++;
          } else if (str0.equals("2")) {
              System.out.println("Введите название товара для удаления.");
              String str01 = scan.nextLine();
              for (int k = 0; k < i; k++) {
                  Product p = products[k];
                  if (p != null && p.getName().equals(str01)){
                      products [k] = null;
                      break;
                  }
              }
          } else if (str0.equals("0")) {
              System.out.println("Выбор товаров завершён");
              break;
          }

        }
        scan.close();

        Deal deal = new Deal(){
            LocalDate deadline = LocalDate.now().plus(10, ChronoUnit.DAYS);

            public LocalDate getDeadline() {
                return deadline;
            }

            public void setDeadline(LocalDate deadline) {
                this.deadline = deadline;

            }
        };

        String phone = "+375(29)123-7896";
        String email = "vgh@mail.ru";
        String dateOfBirth = "10/10/1999";
        User seller = new User("shop", 1000000, phone, email, dateOfBirth);
        if (DateVerifier.verify(dateOfBirth)){
            System.out.println("Дата рождения покупателя " + dateOfBirth);
        } else {
            System.out.println("Дата рождения покупателя введена некорректно.");
        }

        BelarusPhoneValidator b = new BelarusPhoneValidator(phone);
        if (b.isValid (phone)) {
            System.out.println("Номер телефона покупателя " + phone);
        } else {
            System.out.println("Номер телефона покупателя введён некорректно.");
        }

        EmailValidator e = new EmailValidator(email);
        if (e.isValid(email)){
            System.out.println("Email покупателя " + email);
        } else {
            System.out.println("Email покупателя введён некорректно.");
        }

        User buyer = new User("Oleg", 5600);
        deal.setBuyer(buyer);
        deal.setSeller(seller);
        deal.setProducts(products);
        deal.setDedData(date1);

        System.out.println("День: " + date1.getDayOfMonth());
        System.out.println("Месяц: " + date1.getMonth());
        System.out.println("Год: " + date1.getYear());
        System.out.println("Сделка между " + seller.getName() + " и " + buyer.getName());
        for (int j = 0; j < i; j++) {
            Product p = products[j];
            if (p != null) {
                System.out.println(p.getName() + " - " + p.getQuantity() + "шт. : " + p.getPrice() + " рублей со скидкой " + p.calePrice() + " рублей");
            }
        }
        System.out.println("Всего " + deal.caleFullPrice());
    }

}



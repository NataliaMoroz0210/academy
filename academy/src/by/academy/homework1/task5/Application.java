package by.academy.homework1.task5;

public class Application {
    public static void main(String... args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Bob");
        cat2.eat();
        cat2.sleep();
        cat2.walk();
        cat1.grow();
        cat1.grow();
        cat1.grow();
        System.out.println("age cat1 " + cat1.age + " years");

    }
}

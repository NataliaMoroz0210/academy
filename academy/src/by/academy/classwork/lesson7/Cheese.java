package by.academy.classwork.lesson7;

public class Cheese extends Product {
    private int age;

    public Cheese(String name, int price, int quantity, int age) {
        super(name, price, quantity);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected double discount() {
        if (age < 5) {
            return 0.15;
        }
        return 0;
    }
}

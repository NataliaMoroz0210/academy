package by.academy.classwork.lesson6;

public class Cheese0 extends Product0 {


    private final int age;

    public Cheese0(String name, int price, int quantity, int age) {
        super(name, price, quantity);
        this.age = age;
    }

    public Cheese0(int age) {
        super();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Cheese0 gauda = new Cheese0(5);
        gauda.setPrice(6);
        gauda.getPrice();

        Cheese0 parmezan = new Cheese0("h",5,4,1);
        parmezan.getAge();
    }
}
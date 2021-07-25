package by.academy.classwork.lesson6;

import java.util.Objects;

public class Product0 {
    private String name;
    private int price;
    private int quantity;


    public Product0(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product0() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product0 product = (Product0) o;
        return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }



    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("Lesson54{");
        builder.append("name");
        builder.append("price");
        builder.append("quantity");

        builder.append('}');
        return builder.toString();
    }
}
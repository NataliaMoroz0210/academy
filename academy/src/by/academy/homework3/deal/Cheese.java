package by.academy.homework3.deal;

import java.util.Objects;

public class Cheese extends Product {
    private String kind;
    private int age;

    public Cheese(String name, int price, int quantity, int age, String kind) {
        super(name, price, quantity);
        this.age = age;
        this.kind = kind;
    }
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cheese cheese = (Cheese) o;
        return age == cheese.age && Objects.equals(kind, cheese.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kind, age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cheese{");
        sb.append("kind='").append(kind).append('\'');
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}

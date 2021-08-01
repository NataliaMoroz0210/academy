package by.academy.homework3.deal;

import java.util.Objects;

public class Meat extends Product {

    private double weight;
    private String type;


    public Meat(String name, int price, int quantity, String type, double weight) {
        super(name, price, quantity);
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    protected double discount() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Meat meat = (Meat) o;
        return Double.compare(meat.weight, weight) == 0 && Objects.equals(type, meat.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meat{");
        sb.append("weight=").append(weight);
        sb.append(", type='").append(type).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}

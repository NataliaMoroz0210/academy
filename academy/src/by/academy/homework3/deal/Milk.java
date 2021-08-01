package by.academy.homework3.deal;

import java.util.Objects;

public class Milk extends Product {
    private double fatcontent;
    private double volume;

    public Milk(String name, int price, int quantity, double fatcontent, double volume) {
        super(name, price, quantity);
        this.fatcontent = fatcontent;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFatcontent() {
        return fatcontent;
    }

    public void setFatcontent(double fatcontent) {
        this.fatcontent = fatcontent;
    }

    @Override
    protected double discount() {
        if (fatcontent == 3.2) {
            return 0.25;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Milk milk = (Milk) o;
        return Double.compare(milk.fatcontent, fatcontent) == 0 && Double.compare(milk.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fatcontent, volume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Milk{");
        sb.append("fatcontent=").append(fatcontent);
        sb.append(", volume=").append(volume);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}


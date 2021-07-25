package by.academy.classwork.lesson7;

public class Milk extends Product {
    private double fatcontent;

    public Milk(String name, int price, int quantity, double fatcontent) {
        super(name, price, quantity);
        this.fatcontent = fatcontent;
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
}


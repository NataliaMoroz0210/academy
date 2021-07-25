package by.academy.classwork.lesson7;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Deal {
    private Product[] products;
    private User seller;
    private User buyer;
    private Date dedData;

    public double caleFullPrice() {
        double caleFullPrice = 0;
        if (products != null) {
            for (Product p : products) {
                caleFullPrice += p.calePrice();
            }
        }
        return caleFullPrice;
    }


    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Date getDedData() {
        return dedData;
    }

    public void setDedData(Date dedData) {
        this.dedData = dedData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deal deal = (Deal) o;
        return Arrays.equals(products, deal.products) && Objects.equals(seller, deal.seller) && Objects.equals(buyer, deal.buyer) && Objects.equals(dedData, deal.dedData);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seller, buyer, dedData);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deal{");
        sb.append("products=").append(Arrays.toString(products));
        sb.append(", seller=").append(seller);
        sb.append(", buyer=").append(buyer);
        sb.append(", dedData=").append(dedData);
        sb.append('}');
        return sb.toString();
    }
}



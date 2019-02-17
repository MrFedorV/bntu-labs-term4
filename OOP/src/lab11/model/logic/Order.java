package lab11.model.logic;

public class Order {
    private Product product;
    private int amount;

    public Order(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    int getAmount() {
        return this.amount;
    }

    Product getProduct() {
        return this.product;
    }

    @Override
    public String toString() {
        return this.amount + " x " + this.product;
    }
}

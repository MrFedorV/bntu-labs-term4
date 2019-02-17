package lab11.model.logic;

import lab11.utils.CurrencyHandler;

public class Customer {
    private int cash;
    private Order[] orders = new Order[0];

    public Customer(int cash) {
        this.cash = cash;
    }

    public void addOrders(Order[] orders) {
        if (orders != null) {
            Order[] newOrders = new Order[this.orders.length + orders.length];

            System.arraycopy(this.orders, 0, newOrders, 0, this.orders.length);
            System.arraycopy(orders, 0, newOrders, this.orders.length, orders.length);

            this.orders = newOrders;
        }
    }

    public String getCustomerInfo() {
        StringBuilder result = new StringBuilder();

        result.append(this.toString()).append("ordered:\n");
        for (Order o: this.orders) {
            result.append("  ").append(o.toString()).append("\n");
        }

        return result.toString();
    }
    
    public boolean purchaseOrders() {
        int totalPrice = countOrdersTotalPrice();

        if (totalPrice <= this.cash) {
            this.cash -= totalPrice;
            this.orders = new Order[0];
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Customer (" + CurrencyHandler.getCurrencyNotation(this.cash) + ")";
    }

    public int countOrdersTotalPrice() {
        int totalPrice = 0;

        for (Order o: this.orders) {
            totalPrice += o.getAmount() * o.getProduct().getPrice();
        }

        return totalPrice;
    }
}

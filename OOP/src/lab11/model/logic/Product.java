package lab11.model.logic;

import lab11.utils.CurrencyHandler;

public class Product {
    private String title;
    private int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.title + " (" + CurrencyHandler.getCurrencyNotation(this.price) + ")";
    }
}

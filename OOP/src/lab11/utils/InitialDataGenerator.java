package lab11.utils;

import java.util.Random;

import lab11.model.logic.Store;
import lab11.model.logic.Customer;
import lab11.model.logic.Product;
import lab11.model.logic.Order;

public class InitialDataGenerator {
    private static final String[] DEFAULT_PRODUCTS = {
            "Juice", "Snack", "Crisps", "Cola", "Cookies",
            "Apple", "Orange", "Banana", "Melon", "Pineapple",
            "Milk", "Bread", "Pasta", "Rice", "Eggs", "Meat"
    };

    private static final int MAX_CUSTOMER_CASH = 10000;
    private static final int MAX_PRODUCT_PRICE = 1000;
    private static final int MAX_PURCHASE_AMOUNT = 3;

    private static Random rd = new Random();

    public static Store generateNewStore(String title) {
        return new Store(title);
    }

    public static void addRandomProducts(Store store, int amount) {
        Product[] products = new Product[amount];

        for (int i = 0; i < amount; i++) {
            String productTitle = DEFAULT_PRODUCTS[rd.nextInt(DEFAULT_PRODUCTS.length)];
            int productPrice = rd.nextInt(MAX_PRODUCT_PRICE);
            products[i] = new Product(productTitle, productPrice);
        }

        store.addProducts(products);
    }

    public static Customer generateRandomCustomer() {
        int customerCash = rd.nextInt(MAX_CUSTOMER_CASH);
        return new Customer(customerCash);
    }

    public static void makeRandomOrders(Customer customer, Store store, int amount) {
        Order[] orders = new Order[amount];
        Product[] products = store.getProducts();

        for (int i = 0; i < amount; i++) {
            Product product = products[rd.nextInt(products.length)];
            int purchasedAmount = rd.nextInt(MAX_PURCHASE_AMOUNT) + 1;
            orders[i] = new Order(product, purchasedAmount);
        }

        customer.addOrders(orders);
    }
}

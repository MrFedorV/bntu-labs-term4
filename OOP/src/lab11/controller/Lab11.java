package lab11.controller;

import view.Printer;

import lab11.model.logic.Store;
import lab11.model.logic.Customer;
import lab11.utils.CurrencyHandler;
import lab11.utils.InitialDataGenerator;

public class Lab11 {
    private static final String DEFAULT_STORE_TITLE = "Walmart";
    private static final int DEFAULT_STORE_PRODUCTS_AMOUNT = 10;
    private static final int DEFAULT_ORDERS_AMOUNT = 3;

    public static void main(String[] args) {
        String storeTitle = DEFAULT_STORE_TITLE;
        int productsAmount = DEFAULT_STORE_PRODUCTS_AMOUNT;
        int ordersAmount = DEFAULT_ORDERS_AMOUNT;

        if (args.length >= 3) {
            storeTitle = args[0];
            productsAmount = Integer.parseInt(args[1]);
            ordersAmount = Integer.parseInt(args[2]);
        }

        Store store = InitialDataGenerator.generateNewStore(storeTitle);
        InitialDataGenerator.addRandomProducts(store, productsAmount);

        Customer customer = InitialDataGenerator.generateRandomCustomer();
        InitialDataGenerator.makeRandomOrders(customer, store, ordersAmount);

        Printer.print(store.getStoreInfo());
        Printer.print(customer.getCustomerInfo());

        int totalPrice = customer.countOrdersTotalPrice();
        Printer.print("Total price is " + CurrencyHandler.getCurrencyNotation(totalPrice) + ".");

        boolean isSuccessfullyPurchased = customer.purchaseOrders();
        if (isSuccessfullyPurchased) {
            Printer.print("You've been successfully purchased the products.");
        } else {
            Printer.print("Cannot purchase your products (no cash).");
        }
    }
}

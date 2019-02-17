package lab11.utils;

public class CurrencyHandler {
    private static final String currencyTitle = "BYN";

    public static String getCurrencyNotation(int amount) {
        return (float) amount / 100 + " " + currencyTitle;
    }
}

package utils;

import java.util.Random;

import utils.UserInput;

import java.math.BigDecimal;

public class ArrayInitializer {
    public static void initArrayRandomly(double[] array, int min, int max) {
        double el = 0.0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            el = (double)(random.nextInt(max - min) + min) + random.nextDouble();
            array[i] = BigDecimal.valueOf(el).setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue();
        }
    }


    public static void initArrayByHand(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = UserInput.inputFloat("");
        }
    }
}

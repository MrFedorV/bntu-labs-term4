package lab11.model.logic;

import java.math.BigDecimal;

public class ArrayHandler {
    public static double sumOfNegativeElements(double[] array) {
        double sum = 0;

        for (double v : array) {
            if (v < 0) {
                sum += v;
            }
        }

        return sum;
    }
    
    public static double multiplicationOfElements(double[] array) {
        int indOfMinEl = 0, indOfMaxEl = 0;
        double maxEl = Integer.MIN_VALUE, minEl = Integer.MAX_VALUE, multiplication = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxEl) {
                maxEl = array[i];
                indOfMaxEl = i;
            } else if (array[i] < minEl) {
                minEl = array[i];
                indOfMinEl = i;
            }
        }

        if (indOfMaxEl > indOfMinEl) {
            for (int i = indOfMinEl + 1; i < indOfMaxEl; i++) {
                multiplication *= array[i];
            }
        } else if (indOfMinEl > indOfMaxEl) {
            for (int i = indOfMaxEl + 1; i < indOfMinEl; i++) {
                multiplication *= array[i];
            }
        }

        return BigDecimal.valueOf(multiplication).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
    }
    
    public  static double multiplicationOfNegativeElements(double[] array) {
        double mul = 1;

        for (double v : array) {
            if (v < 0) {
                mul *= v;
            }
        }

        return  mul;
    }
    
    public static double sumOfElementsBeforeMax(double[] array) {
        double maxEl = Integer.MIN_VALUE, sum = 0;
        int indOfMaxEl = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxEl) {
                maxEl = array[i];
                indOfMaxEl = i;
            }
        }

        for (int i = 0; i < indOfMaxEl; i++) {
        	if (array[i] > 0) {
        		sum += array[i];
        	}
        }

        return sum;
    }
}

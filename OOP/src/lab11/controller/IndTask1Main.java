package lab11.controller;

import java.util.Arrays;

import lab11.model.logic.ArrayHandler;
import view.Printer;

import utils.UserInput;
import utils.ArrayInitializer;

public class IndTask1Main {
    private static final int MAX_ARRAY_ELEMENT = 10;

    public static void main(String[] args) {
    	
        int sizeOfArray = UserInput.inputInt("Please, input the size of array: ");
        double[] array = new double[sizeOfArray];
        
        boolean initializeByHand = UserInput.userAgree("Do you want to initialize the array by hand? ");
        
        if (!initializeByHand) {
            ArrayInitializer.initArrayRandomly(array, -MAX_ARRAY_ELEMENT, MAX_ARRAY_ELEMENT);    
        } else {
            ArrayInitializer.initArrayByHand(array);
        }
        
        Printer.print("Your array: " + Arrays.toString(array));
        
        double multiplicationOfNegtiveElements = ArrayHandler.multiplicationOfNegativeElements(array);
        double sumOfElements = ArrayHandler.sumOfElementsBeforeMax(array);
        
        Printer.print("The multiplication of negative elements of array is " + multiplicationOfNegtiveElements);
        Printer.print("The sum of elements before maximal element of array is " + sumOfElements);
    }
}

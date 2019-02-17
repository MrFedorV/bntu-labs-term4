package lab11.controller;

import java.util.Arrays;

import lab11.model.logic.ArrayHandler;
import view.Printer;

import utils.UserInput;
import utils.ArrayInitializer;

public class IndTask2Main {
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
        
        double multiplicationOfElements = ArrayHandler.multiplicationOfElements(array);
        double sumOfElements = ArrayHandler.sumOfNegativeElements(array);
        
        Printer.print("The summation of negative elements of array is " + sumOfElements);
        Printer.print("Multiplication between min and max is " + multiplicationOfElements);
    }
}

package com.cydeo.thirdWeek;

import java.util.Arrays;

public class ArrayOfDigits {

    public static void main(String[] args) {
        int inputNumber = 490;
        int[] result = convertToDigitsArray(inputNumber);

        System.out.println("Input Number: " + inputNumber);
        System.out.println("Output Array: " + Arrays.toString(result));
    }

    public static int[] convertToDigitsArray(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input should be a positive integer.");
        }

        // Convert the integer to a string to get individual digits
        String numberString = Integer.toString(number);
        // Create an array to store the digits
        int[] digitsArray = new int[numberString.length()];

        // Fill the array with individual digits
        for (int i = 0; i < numberString.length(); i++) {
            digitsArray[i] = Character.getNumericValue(numberString.charAt(i));
        }

        return digitsArray;
    }


}

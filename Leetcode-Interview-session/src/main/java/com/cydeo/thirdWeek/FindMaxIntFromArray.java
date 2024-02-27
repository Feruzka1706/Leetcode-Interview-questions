package com.cydeo.thirdWeek;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class FindMaxIntFromArray {

    /**
     * Write a function that can find the maximum number from an int Array.
     * input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
     */

    public static void main(String[] args) {

        int[] numbers ={20,0,-5,30,90};
        System.out.println(maxInt(numbers));
    }

    public static int maxInt(int[] array){
        if(array.length==0){
            return 0;
        }
        return Arrays.stream(array).max().orElseThrow(()-> new NoSuchElementException(""));
    }

}

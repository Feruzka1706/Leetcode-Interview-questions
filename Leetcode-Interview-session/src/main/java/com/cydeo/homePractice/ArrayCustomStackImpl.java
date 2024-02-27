package com.cydeo.homePractice;


import java.util.Arrays;

public class ArrayCustomStackImpl<E> implements CustomStack<E> {

   private E[] customArray;
   private int currentIndex;

    public ArrayCustomStackImpl() {
        this.customArray = (E[]) new Object[100];
        this.currentIndex= -1;
    }

    @Override
    public E peek() throws Exception {
        if(currentIndex < 0){
            throw new RuntimeException("Stack is already empty...");
        }
        return customArray[currentIndex];
    }

    @Override
    public E pop() throws Exception {
        if(currentIndex < 0){
            throw new RuntimeException("Stack is already empty...");
        }
        currentIndex = currentIndex - 1;
        //reassigning current index with previous index of element before returning it to customer
        return customArray[currentIndex+1];
    }

    @Override
    public E push(E item) {
        if(customArray.length-1 == currentIndex){
            E[] newCustomArray = (E[]) new Object[customArray.length * 2 ];

            for (int i = 0; i < customArray.length; i++) {
                newCustomArray[i] = customArray[i];
            }
            this.customArray = newCustomArray;
        }

        currentIndex = currentIndex +1;
        customArray[currentIndex] = item;
        return customArray[currentIndex];
    }

    @Override
    public boolean isEmpty() {
        return currentIndex < 0;
    }

    @Override
    public int search(E item) throws Exception {
        if(currentIndex < 0){
            throw new RuntimeException("Stack is already empty...");
        }

        for (int i = currentIndex; i >=0; i--) {
            if(customArray[i].equals(item)){
                return i;
            }
        }
        /**
         * int index = IntStream.range(0, currentIndex + 1)
         *             .filter(i -> customArray[i].equals(item))
         *             .findFirst()
         *             .orElse(-1);
         * return index;
         */
      return -1;
    }


}

package com.cydeo.homePractice.queue;


public class ArrayCustomQueueImpl<E> implements CustomQueue<E>{

    private E[] customArray;
    private int currentIndex;


    public ArrayCustomQueueImpl() {
        this.customArray = (E[]) new Object[100];
        this.currentIndex=-1;
    }


    @Override
    public boolean add(E item) { //1
        boolean result = false;
        if(customArray.length-1 == currentIndex){ // 99
            E[] newCustomArray = (E[]) new Object[customArray.length*2];

            for (int i = 0; i < customArray.length; i++) {

                newCustomArray[i] = customArray[i];
                result=true;
            }
            this.customArray=newCustomArray;
        }
        currentIndex = currentIndex +1;
        customArray[currentIndex]= item;
        return result;
    }

    @Override
    public E peek() {
        if(currentIndex < 0){
            throw new RuntimeException("Queue is already empty...");
        }
        return customArray[0];
    }

    @Override
    public E poll() {
        if(currentIndex<0){
            throw new RuntimeException("Queue is already empty...");
        }

        E tempItem = customArray[0];
        for (int i = 0; i < customArray.length-1; i++) {
            customArray[i] = customArray[i+1];
        }
        currentIndex--;
        return tempItem;
    }

    public void printElements(){
        for (int i = 0; i < customArray.length; i++) {
            if(customArray[i] != null){
                System.out.print(customArray[i] +" -> ");
            }
        }
        System.out.println();
    }

}

package com.cydeo.homePractice.stack;

public interface CustomStack<E> {

    E peek() throws Exception; //- returns the element to the top without removing the element
    E pop() throws Exception; //- removes the top element
    E push(E item); //returns E - inserts the element to last
    boolean isEmpty();  //- checks if stack is empty or not
    int search(E item) throws Exception; // returns index of search element



}

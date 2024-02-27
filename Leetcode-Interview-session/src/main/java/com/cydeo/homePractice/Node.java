package com.cydeo.homePractice;

public class Node <E> {

    private E value;
    public Node<E> nextNode;


    public Node(E value) {
        this.value = value;
        this.nextNode = null;
    }

    public E getValue() {
        return  value;
    }

    public void setValue(E value) {
        this.value = value;
    }

}

package com.cydeo.homePractice.common;

public class SNode<E> {

    private E value;
    public SNode<E> nextNode;


    public SNode(E value) {
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

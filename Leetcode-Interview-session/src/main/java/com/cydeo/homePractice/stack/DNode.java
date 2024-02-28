package com.cydeo.homePractice.stack;

public class DNode<E> {

    private E data;

    public DNode<E> nextNode;

    public DNode<E> previousNode;

    public DNode(E data) {
        this.data = data;
        this.nextNode = null;
        this.previousNode = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}

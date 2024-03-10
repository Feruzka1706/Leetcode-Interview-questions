package com.cydeo.homePractice.queue;

import com.cydeo.homePractice.common.SNode;

public class SingleLinkedListCustomQueueImpl<E> implements CustomQueue<E>{

    private SNode<E> head;
    private SNode<E> tail;

    public SingleLinkedListCustomQueueImpl() {
        this.head = new SNode<>(null);
        this.tail = head;
    }

    @Override
    public boolean add(E item) { //ignoring condition check for size
        SNode<E> tempNode= new SNode<>(item);
        tail.nextNode=tempNode;
        tail=tempNode;
        return true;
    }

    @Override
    public E peek() {
        if(head.nextNode==null){
            throw new RuntimeException("Queue is already empty...");
        }
        return head.nextNode.getValue();
    }

    @Override
    public E poll() {
        SNode<E> currentNode = head.nextNode;
        if(head.nextNode == null){
            throw new RuntimeException("Queue is already empty...");
        }
        head.nextNode =currentNode.nextNode;
        if (currentNode == tail){
            tail = head;
        }
        return currentNode.getValue();
    }

    public void printNodes(){
        SNode<E> current = head.nextNode;
        while (current !=null){ //I want to process tail
            System.out.print(current.getValue()+" -> ");
            current = current.nextNode;
        }
        System.out.println();
    }
}

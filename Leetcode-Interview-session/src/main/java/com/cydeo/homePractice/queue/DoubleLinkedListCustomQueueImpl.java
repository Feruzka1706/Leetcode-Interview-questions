package com.cydeo.homePractice.queue;

import com.cydeo.homePractice.common.DNode;


public class DoubleLinkedListCustomQueueImpl<E> implements CustomQueue<E> {

    private DNode<E> head;
    private DNode<E> tail;

    public DoubleLinkedListCustomQueueImpl() {
        this.head = new DNode<>(null);
        this.tail = head;
    }

    @Override
    public boolean add(E item) {//ignoring condition check for size
        DNode<E> newNode = new DNode<>(item);
        newNode.previousNode=tail;
        tail.nextNode=newNode;
        tail=newNode;
        return true;
    }

    @Override
    public E peek() {
        if(head.nextNode==null){
            throw new RuntimeException("Queue is already empty....");
        }
        return head.nextNode.getData();
    }

    @Override
    public E poll() {
        if(head==tail || head.nextNode==null){
            throw new RuntimeException("Queue is already empty....");
        }
        DNode<E> tempNode = head.nextNode;
        if(tempNode.nextNode==null){
            head.nextNode=null;
            tail=head;
            return tempNode.getData();
        }

        head.nextNode=tempNode.nextNode;
        tempNode.nextNode.previousNode=head;
        return tempNode.getData();
    }

    public void printNodes(){
        DNode<E> current = head.nextNode;
        while (current !=null){ //I want to process tail
            System.out.print(current.getData()+" -> ");
            current = current.nextNode;
        }
        System.out.println();
    }
}

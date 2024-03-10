package com.cydeo.homePractice.stack;

import com.cydeo.homePractice.common.DNode;

public class DoubleLinkedListCustomStackImpl<E> implements CustomStack<E>{

    private DNode<E> head;
    private DNode<E> tail;

    public DoubleLinkedListCustomStackImpl() {
        this.head = new DNode<>(null);
        this.tail = head;
    }

    @Override
    public E peek() throws Exception {
        if(head.nextNode ==null){
            throw new RuntimeException("Stack is empty...");
        }
        return tail.getData();
    }

    @Override
    public E pop() throws Exception {
        if(head==tail || head.nextNode==null){
            throw new RuntimeException("Stack is empty...");
        }
        DNode<E> temp = tail;
        tail = tail.previousNode;
        tail.nextNode=null;
        return temp.getData();
    }

    @Override
    public E push(E item) {
        DNode<E> newNode = new DNode<>(item);
        newNode.previousNode=tail; //making connection of new node with tail by assigning previous pointer
        tail.nextNode=newNode; //making connection tail next node with new node
        tail=newNode; //updating tail with new added node
        return item;
    }

    @Override
    public boolean isEmpty() {
        return head.nextNode==null;
    }

    @Override
    public int search(E item) throws Exception {
        DNode<E> current = head.nextNode;
        int count = 0;
        int latestIndex= -1;

        while(current !=null){ //I want to process tail
            if(current.getData().equals(item)){
                latestIndex=count;
            }
            current=current.nextNode;
            count++;
        }
        return latestIndex;
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

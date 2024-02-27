package com.cydeo.homePractice;

import java.util.LinkedList;

public class SingleLinkedListCustomStackImpl <E>  implements CustomStack<E>{

   private Node<E> head;
   private Node<E> tail;

    public SingleLinkedListCustomStackImpl() {
        this.head = new Node<>(null);
        this.tail = head;
    }

    @Override
    public E peek() throws Exception {
        if(head.nextNode==null){
            throw new RuntimeException("Stack is empty...");
        }
        return tail.getValue();
    }

    @Override
    public E pop() throws Exception {
        Node<E> current = head;
        Node<E> previousNode = null;

        if(current.nextNode==null){
            throw new RuntimeException("Stack is empty...");
        }

        /**
         * This while loop runs until Nodes go to tail (after tail there is nothing)
         * inside loop I am assigning current node value as previous node since I don't have
         * previous() to go back of prev node. Then I am marking current node with its next upcoming node
         * again going through loop until condition is true
         */
        while (current.nextNode !=null){  //value=null, 1, 2, 3 -> null node
            previousNode = current;  //value[null], 1, 2, 3 - null
            current= current.nextNode; //1 -> 2  -> 3
        }
        previousNode.nextNode=null;
        tail=previousNode;
        return current.getValue();
    }

    @Override
    public E push(E item) { //int
        Node<E> tempNode = new Node<>(item);
        tail.nextNode=tempNode;
        tail=tempNode;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return head.nextNode==null;
    }

    @Override
    public int search(E item) throws Exception {
       //iterate over the nodes and search the requested element
       Node<E> current = head.nextNode;
        int count = 0;
        int latestIndex=-1;
        while(current !=null){
            if(current.getValue().equals(item)){
              latestIndex=count; //0, 1
            }
            current = current.nextNode;
            count++;
        }
        return latestIndex;
    }

    public void printNodes(){
        Node<E> current = head;
        while (current !=null){
            System.out.print(current.getValue()+" -> ");
            current = current.nextNode;
        }
        System.out.println();
    }

}

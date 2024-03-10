package com.cydeo.homePractice.stack;

import com.cydeo.homePractice.common.SNode;

public class SingleLinkedListCustomStackImpl <E>  implements CustomStack<E>{

   private SNode<E> head;
   private SNode<E> tail;

    public SingleLinkedListCustomStackImpl() {
        this.head = new SNode<>(null);
        this.tail = head;
    }

    @Override
    public E peek() throws Exception {
        if(head.nextNode ==null){
            throw new RuntimeException("Stack is empty...");
        }
        return tail.getValue();
    }

    @Override
    public E pop() throws Exception {
        SNode<E> current = head;
        SNode<E> previousSNode = null; //initializing the node, by default making null

        if(current.nextNode ==null){
            throw new RuntimeException("Stack is empty...");
        }

        /**
         * This while loop runs until Nodes go to tail (after tail there is nothing)
         * inside loop I am assigning current node value as previous node since I don't have
         * previous() to go back of prev node. Then I am marking current node with its next upcoming node
         * again going through loop until condition is true
         */
        while (current.nextNode !=null){ //I do NOT want to process tail //value=null, 1, 2, 3 -> null node
            previousSNode = current;  //value[null], 1, 2, 3 - null
            current= current.nextNode; //1 -> 2  -> 3
        }
        previousSNode.nextNode =null;
        tail= previousSNode;
        return current.getValue();
    }

    @Override
    public E push(E item) { //int
        SNode<E> tempSNode = new SNode<>(item);
        tail.nextNode = tempSNode;
        tail= tempSNode;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return head.nextNode ==null;
    }

    @Override
    public int search(E item) throws Exception {
       //iterate over the nodes and search the requested element
       SNode<E> current = head.nextNode;
        int count = 0;
        int latestIndex=-1;
        while(current !=null){ //I want to process tail
            if(current.getValue().equals(item)){
              latestIndex=count; //0, 1
            }
            current = current.nextNode;
            count++;
        }
        return latestIndex;
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

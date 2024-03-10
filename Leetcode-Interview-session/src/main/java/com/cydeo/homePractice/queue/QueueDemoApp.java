package com.cydeo.homePractice.queue;

import com.cydeo.homePractice.stack.ArrayCustomStackImpl;
import com.cydeo.homePractice.stack.DoubleLinkedListCustomStackImpl;

import java.util.Arrays;
import java.util.LinkedList;

public class QueueDemoApp {

    public static void main(String[] args) throws Exception {

//        ArrayCustomQueueImpl<Integer> myQueue = new ArrayCustomQueueImpl<>();
//
//        //System.out.println("Deleting top element from stack: " + myQueue.poll());
//        //System.out.println("Retrieving top element from stack: " + myQueue.peek());
//        myQueue.add(2);
//        System.out.println(myQueue.peek());
//        myQueue.add(10);
//        System.out.println(myQueue.peek());
//        myQueue.add(30);
//        myQueue.printElements();
//        System.out.println(myQueue.poll());
//        myQueue.printElements();
//        System.out.println(myQueue.poll());
//        myQueue.printElements();
//        System.out.println(myQueue.poll());
//        myQueue.printElements();
//        System.out.println(myQueue.poll());
//        myQueue.printElements();

//        //System.out.println("Popping the last element from stack: "+ myQueue.pop());
//        System.out.println("After popping last element: "+ myQueue.peek());
//        myQueue.push(100);
//        System.out.println("After entering double sized array check: " +myQueue.peek());
//

//        System.out.println("****************** Linked List QUEUE implementation ****************");
//        SingleLinkedListCustomQueueImpl<Integer> myQueue = new SingleLinkedListCustomQueueImpl<>();
//
//        //System.out.println("Deleting top element from queue: " + myQueue.poll());
//        //System.out.println("Retrieving top element from queue: " + myQueue.peek());
//        myQueue.add(2);
//        System.out.println(myQueue.peek());
//        myQueue.add(10);
//        System.out.println(myQueue.peek());
//        myQueue.add(30);
//        myQueue.printNodes();
//        System.out.println("Deleting element from Queue: "+myQueue.poll());
//        myQueue.printNodes();
//        System.out.println("Deleting element from Queue: "+myQueue.poll());
//        myQueue.printNodes();
//        System.out.println("Deleting element from Queue: "+myQueue.poll());
//        myQueue.printNodes();
////        System.out.println("Deleting element from Queue: "+myQueue.poll());
////        myQueue.printNodes();
//
//        System.out.println("Inserting element to Queue: " +myQueue.add(40));
//        System.out.println("Retrieving first element: " + myQueue.peek());
//        myQueue.printNodes();

        System.out.println("****************** Linked List QUEUE implementation ****************");
        DoubleLinkedListCustomQueueImpl<Integer> myQueue = new DoubleLinkedListCustomQueueImpl<>();

        //System.out.println("Deleting top element from queue: " + myQueue.poll());
        //System.out.println("Retrieving top element from queue: " + myQueue.peek());
        myQueue.add(2);
        System.out.println(myQueue.peek());
        myQueue.add(10);
        System.out.println(myQueue.peek());
        myQueue.add(30);
        myQueue.printNodes();
        System.out.println("Deleting element from Queue: "+myQueue.poll());
        myQueue.printNodes();
        System.out.println("Deleting element from Queue: "+myQueue.poll());
        myQueue.printNodes();
        System.out.println("Deleting element from Queue: "+myQueue.poll());
        myQueue.printNodes();
//        System.out.println("Deleting element from Queue: "+myQueue.poll());
//        myQueue.printNodes();

        System.out.println("Inserting element to Queue: " +myQueue.add(40));
        System.out.println("Retrieving first element: " + myQueue.peek());
        myQueue.printNodes();

    }
}

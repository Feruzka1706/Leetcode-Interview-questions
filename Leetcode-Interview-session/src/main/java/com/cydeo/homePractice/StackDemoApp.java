package com.cydeo.homePractice;

public class StackDemoApp {

    public static void main(String[] args) throws Exception {

        ArrayCustomStackImpl<Integer> myStack = new ArrayCustomStackImpl<>();

        //System.out.println("Deleting top element from stack: " + myStack.pop());
        //System.out.println("Retrieving top element from stack: " + myStack.peek());
//        System.out.println("Is My stack empty: "+ myStack.isEmpty());
//        myStack.push(2);
//        System.out.println(myStack.peek());
//        myStack.push(10);
//        System.out.println(myStack.peek());
//        myStack.push(30);
//        System.out.println(myStack.peek());
//        myStack.push(-1);
//        System.out.println(myStack.peek());
//        myStack.push(17);
//        //System.out.println(myStack.peek());
//        System.out.println("Searching index of element: " +myStack.search(17));
//        //System.out.println("Popping the last element from stack: "+ myStack.pop());
//        System.out.println("After popping last element: "+ myStack.peek());
//        myStack.push(100);
//        System.out.println("After entering double sized array check: " +myStack.peek());
//

        System.out.println("***********************************************************");

        SingleLinkedListCustomStackImpl<Integer> myStack1 = new SingleLinkedListCustomStackImpl<>();

        //System.out.println("Deleting top element from stack: " + myStack1.pop());
        //System.out.println("Retrieving top element from stack: " + myStack1.peek());
        //System.out.println("Is My stack empty: "+ myStack1.isEmpty());
        myStack1.push(2);
        System.out.println(myStack1.peek());
        myStack1.push(10);
        System.out.println(myStack1.peek());
        myStack1.push(30);
        System.out.println(myStack1.peek());
        myStack1.push(-1);
        System.out.println(myStack1.peek());
        myStack1.push(17);
        System.out.println(myStack1.peek());
        System.out.println("Searching index of element: " +myStack1.search(17));
        myStack1.printNodes();
        System.out.println("Popping the last element from stack: "+ myStack1.pop());
        myStack1.printNodes();
        System.out.println("After popping last element: "+ myStack1.peek());
        myStack1.push(100);
        System.out.println("After entering double sized array check: " +myStack1.peek());

    }
}
